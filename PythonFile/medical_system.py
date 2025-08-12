from datetime import datetime, timedelta


class Patient:
    _used_ids = set()

    def __init__(self, id, name, dob, contact, medical_history=None):
        if id in Patient._used_ids:
            raise ValueError(f"Patient ID {id} already exists.")
        Patient._used_ids.add(id)

        if not name or not isinstance(name, str):
            raise ValueError("Name must be a non-empty string.")
        try:
            datetime.strptime(dob, "%Y-%m-%d")
        except ValueError:
            raise ValueError("DOB must be in YYYY-MM-DD format.")

        self.id = id
        self.name = name
        self.dob = dob
        self.contact = contact
        self.medical_history = medical_history or []

    def get_info(self):
        return f"{self.name}, DOB: {self.dob}, Contact: {self.contact}"


class Doctor:
    _used_ids = set()

    def __init__(self, id, name, specialization, contact):
        if id in Doctor._used_ids:
            raise ValueError(f"Doctor ID {id} already exists.")
        Doctor._used_ids.add(id)

        if not name or not specialization:
            raise ValueError("Name and Specialization are required.")

        self.id = id
        self.name = name
        self.specialization = specialization
        self.contact = contact

    def get_info(self):
        return f"{self.name} ({self.specialization}) - {self.contact}"


class Appointment:
    def __init__(self, id, patient, doctor, date, time):
        self.id = id
        self.patient = patient
        self.doctor = doctor
        self.date = date
        self.time = time

    def get_summary(self):
        return f"{self.date} {self.time}: {self.patient.name} with {self.doctor.name}"


class AppointmentManager:
    def __init__(self):
        self.appointments = []

    def book_appointment(self, id, patient, doctor, date, time):
        for appt in self.appointments:
            if appt.date == date and appt.time == time:
                if appt.patient.id == patient.id:
                    raise Exception(f"Patient {patient.name} already has an appointment at {date} {time}")
                if appt.doctor.id == doctor.id:
                    raise Exception(f"Doctor {doctor.name} is already booked at {date} {time}")

        new_appt = Appointment(id, patient, doctor, date, time)
        self.appointments.append(new_appt)
        return new_appt

    def reschedule_appointment(appointments, user_id, reason):
        if reason.lower() in ["emergency", "not available"]:
            current_appt = appointments.get(user_id)

            if not current_appt:
                return "No existing appointment found."

            new_date = current_appt["date"] + timedelta(days=1)

            confirm = input(f"Reschedule to {new_date}? (yes/no): ")
            if confirm.lower() == "yes":
                appointments[user_id]["date"] = new_date
                return f"Appointment rescheduled to {new_date} successfully!"
            else:
                return "Rescheduling cancelled by user."

        return "No emergency detected. Appointment remains the same."



