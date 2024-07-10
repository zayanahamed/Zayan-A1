public class GeneralPractitioner extends HealthProfessional{
    private String specialization;

    public GeneralPractitioner() {
    }

    public GeneralPractitioner(int id, String name, String basicInformation, String specialization) {
        super(id, name, basicInformation);
        this.specialization = specialization;
    }

    public void printGeneralPractitionerDetails() {
        System.out.println("The doctor details are:");
        super.printAllDetailsOfHealthProfessional();
        System.out.println("HealthProfessional's Specialization: " + specialization);
        System.out.println("HealthProfessional Type: General Practitioner");
    }
}
