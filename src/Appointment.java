public class Appointment {

    private String patientName;
    private String patientMobile;
    private String preferredTimeSlot;
    private HealthProfessional healthProfessional;

    public Appointment() {

    }

    public Appointment(String patientName, String patientMobile, String preferredTimeSlot, HealthProfessional healthProfessional) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.preferredTimeSlot = preferredTimeSlot;
        this.healthProfessional = healthProfessional;
    }
    // print the details about the patients
    public void printDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile: " + patientMobile);
        System.out.println("Patient Time Slot: " + preferredTimeSlot);
        healthProfessional.printAllDetailsOfHealthProfessional();
    }

    public String getMobile() {
        return patientMobile;
    }
}
