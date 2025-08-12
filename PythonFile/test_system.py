import unittest
from datetime import datetime, timedelta

from medical_system import Patient, Doctor, AppointmentManager

class TestMedicalSystem(unittest.TestCase):

    def test_patient_creation(self):
        patient = Patient(1, "Ada", "1999-01-01", "08012345678", ["Diabetes"])
        self.assertEqual(patient.name, "Ada")
        self.assertEqual(len(patient.medical_history), 1)

    def test_doctor_creation(self):
        doctor = Doctor(1, "Dr. Wyser", "Cardiology", "08123456789")
        self.assertEqual(doctor.specialization, "Cardiology")

    def test_successful_appointment(self):
        patient = Patient(2, "John", "2000-02-02", "07012345678")
        doctor = Doctor(2, "Dr. Ibrahim", "Neurology", "08087654321")
        manager = AppointmentManager()
        appt = manager.book_appointment(1, patient, doctor, "2025-07-26", "14:00")
        self.assertEqual(appt.patient.name, "John")

    def test_conflicting_patient_appointment(self):
        manager = AppointmentManager()
        p = Patient(3, "Rasaq", "2002-03-03", "08011112222")
        d1 = Doctor(3, "Dr. John Sleep", "Ortho", "08122220009")
        d2 = Doctor(4, "Dr. EddyWyser", "Pediatrics", "08133334444")
        manager.book_appointment(1, p, d1, "2025-07-26", "16:00")
        with self.assertRaises(Exception):
            manager.book_appointment(2, p, d2, "2025-07-26", "16:00")

    def test_conflicting_doctor_appointment(self):
        manager = AppointmentManager()
        p1 = Patient(4, "Olamide", "1995-04-04", "08044445555")
        p2 = Patient(5, "Tega", "1998-05-05", "08055556666")
        d = Doctor(5, "Dr. Eddy", "ENT", "08066667777")
        manager.book_appointment(1, p1, d, "2025-07-26", "18:00")
        with self.assertRaises(Exception):
            manager.book_appointment(2, p2, d, "2025-07-26", "18:00")




    """ def test_reschedule(self):
        self.am = AppointmentManager()
        p1 = Patient(10, "Olamide", "1995-04-04", "08044445555")
        d = Doctor(10, "Dr. Eddy", "ENT", "08066667777")
        self.original_date = (datetime.now() + timedelta(days=1)).strftime("%Y-%m-%d")
        self.original_time = "10:00"
        self.appt = self.am.book_appointment(1, self.patient, self.doctor, self.original_date, self.original_time)

    def test_successful_reschedule(self):
        new_date = (datetime.now() + timedelta(days=3)).strftime("%Y-%m-%d")
        new_time = "15:30"


        self.am.appointments.pop(1)
        new_appt = self.am.book_appointment(2, self.patient, self.doctor, new_date, new_time)


        self.assertEqual(len(self.am.appointments), 1)
        self.assertEqual(new_appt.date, new_date)
        self.assertEqual(new_appt.time, new_time)

    def test_reschedule_to_past_date(self):
        past_date = (datetime.now() - timedelta(days=1)).strftime("%Y-%m-%d")
        with self.assertRaises(ValueError):
            self.am.book_appointment(2, self.patient, self.doctor, past_date, "09:00")


if __name__ == "__main__":
    unittest.main()"""
