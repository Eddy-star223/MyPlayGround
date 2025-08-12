from medical_system import Patient, Doctor, AppointmentManager
from datetime import datetime

patients = []
doctors = []
appointment_manager = AppointmentManager()

def is_valid_date(date_str):
    try:
        datetime.strptime(date_str, "%Y-%m-%d")
        return True
    except ValueError:
        return False

def is_valid_time(time_str):
    try:
        datetime.strptime(time_str, "%H:%M")
        return True
    except ValueError:
        return False

def main():
    while True:
        print("\n--- Medical Record System ---")
        print("1. Add Patient")
        print("2. Add Doctor")
        print("3. Schedule Appointment")
        print("4. View Appointments")
        print("5. Reschedule Appointment")
        print("6. Exit")
        choice = input("Enter choice: ")

        if choice == "1":
            try:
                name = input("Name: ")
                dob = input("DOB (YYYY-MM-DD): ")
                if not is_valid_date(dob):
                    raise ValueError("Invalid DOB format.")
                contact = input("Contact: ")
                history = input("Medical History (comma-separated): ").split(",")
                patient_id = len(patients) + 1
                new_patient = Patient(patient_id, name, dob, contact, history)
                patients.append(new_patient)
                print("Patient added successfully.")
            except Exception as e:
                print("Error:", e)

        elif choice == "2":
            try:
                name = input("Name: ")
                specialization = input("Specialization: ")
                contact = input("Contact: ")
                doctor_id = len(doctors) + 1
                new_doctor = Doctor(doctor_id, name, specialization, contact)
                doctors.append(new_doctor)
                print("Doctor added successfully.")
            except Exception as e:
                print("Error:", e)

        elif choice == "3":
            try:
                print("Patients:")
                for p in patients:
                    print(f"{p.id}: {p.name}")
                pid = int(input("Select patient ID: "))
                patient = next((p for p in patients if p.id == pid), None)
                if not patient:
                    raise ValueError("Invalid Patient ID.")

                print("Doctors:")
                for d in doctors:
                    print(f"{d.id}: {d.name}")
                did = int(input("Select doctor ID: "))
                doctor = next((d for d in doctors if d.id == did), None)
                if not doctor:
                    raise ValueError("Invalid Doctor ID.")

                date = input("Date (YYYY-MM-DD): ")
                time = input("Time (HH:MM): ")
                date_str = datetime.now().date
                try:
                    appointment_date = datetime.strptime(date, "%Y-%m-%d").date()
                    if appointment_date < datetime.now().date():
                        raise ValueError("Appointment date invalid. Please enter current date.")
                except ValueError as e:
                    print("Error:", e)

                if not is_valid_date(date) or not is_valid_time(time):
                    raise ValueError("Invalid date or time format.")

                appt_id = len(appointment_manager.appointments) + 1
                new_appt = appointment_manager.book_appointment(appt_id, patient, doctor, date, time)
            except Exception as e:
                print("Error:", e)
                print("Appointment created successfully!")

        elif choice == "4":
            if not appointment_manager.appointments:
                print("No appointments scheduled.")
            for a in appointment_manager.appointments:
                print(a.get_summary())

        elif choice == "5":
            try:
                for idx, a in enumerate(appointment_manager.appointments):
                    print(f"{idx + 1}: {a.get_summary()}")

                appt_id = int(input("Enter appointment id to reschedule: "))
                appt = appointment_manager.appointments[appt_id - 1]

                reason = input("Reason for reschedule (e.g. emergency, illness): ").lower()
                if reason not in ["emergency", "illness", "travel", "not available"]:
                    print("No valid reason detected. Reschedule aborted.")
                    return

                new_date_str = input("New Date (YYYY-MM-DD): ")
                new_time_str = input("New Time (HH:MM): ")

                new_date = datetime.strptime(new_date_str, "%Y-%m-%d").date()
                new_time = datetime.strptime(new_time_str, "%H:%M").time()

                if new_date < datetime.now().date():
                    raise ValueError("Cannot reschedule to a past date.")

                new_appt_id = len(appointment_manager.appointments) + 1
                updated_appt = appointment_manager.book_appointment(
                    new_appt_id, appt.patient, appt.doctor, new_date_str, new_time_str)

                appointment_manager.appointments.pop(appt_id - 1)

                print("Appointment successfully rescheduled to: ")
                print(updated_appt.get_summary())

            except Exception as e:
                print("Error:", e)

        elif choice == "6":
            print("Goodbye")
            break

if __name__ == "__main__":
    main()
