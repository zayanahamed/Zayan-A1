import java.util.ArrayList;


public class AssignmentOne {
    public static void main(String[] args) {

        // using classes and object for the creation of dr and thier info
        GeneralPractitioner generalPractitioner1 = new GeneralPractitioner(1, "Dr. Zayan B1", "Provides health care for all type of people, ages and diseases", "Family Doctor");
        GeneralPractitioner generalPractitioner2 = new GeneralPractitioner(2, "Dr. Zayan B2", "Provides health care for peaditric emergency", "Peads Emergency");
        GeneralPractitioner generalPractitioner3 = new GeneralPractitioner(3, "Dr. Zayan B3", "Provides emergency services in ICU", "ICU Specialist");

        ChildSpecialist childSpecialist1 = new ChildSpecialist(4, "Dr. Zayan C1", "Specializes in diagnosing and treating heart conditions in children", "Pediatric Cardiology");
        ChildSpecialist childSpecialist2 = new ChildSpecialist(5, "Dr. Zayan C2", "Focuses on treating disorders of the nervous system in children", "Pediatric Neurology");


        generalPractitioner1.printGeneralPractitionerDetails();
        generalPractitioner2.printGeneralPractitionerDetails();
        generalPractitioner3.printGeneralPractitionerDetails();
        childSpecialist1.printChildSpecialistDetails();
        childSpecialist2.printChildSpecialistDetails();

        System.out.println("------------------------------");

        // this code for the appointment booking
        ArrayList<Appointment> appointments = new ArrayList<>();

        createAppointment(appointments, "Zayan Ahmad", "+923001234567", "08:00", generalPractitioner1);
        createAppointment(appointments, "Zayan A1", "+923001239870", "10:00", generalPractitioner2);
        createAppointment(appointments, "Zayan A2", "+923001234560", "14:30", childSpecialist1);
        createAppointment(appointments, "Zayan A3", "+923001234569", "16:00", childSpecialist2);

        printExistingAppointments(appointments);

        cancelBooking(appointments, "+923001234569");

        printExistingAppointments(appointments);

        System.out.println("------------------------------");
    }
    // this function is used for the creating the appointment with dr using name, mobile time and dr
    public static void createAppointment(ArrayList<Appointment> appointments, String patientName, String mobile, String timeSlot, HealthProfessional doctor) {
        Appointment appointment = new Appointment(patientName, mobile, timeSlot, doctor);
        appointments.add(appointment);
    }
    // this function is used to display the Appointments
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printDetails();
            }
        }
    }
    // this function is used to display the cancel the Appointment using the mobile number
    public static void cancelBooking(ArrayList<Appointment> appointments, String mobile) {
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getMobile().equals(mobile)) {
                appointments.remove(i);
                System.out.println("Appointment with mobile " + mobile + " cancelled.");
                return;
            }
        }
        System.out.println("No appointment found with mobile " + mobile + ".");
    }
}