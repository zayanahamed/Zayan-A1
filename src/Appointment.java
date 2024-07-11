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
}
