public class ChildSpecialist extends HealthProfessional {

    private String expertise;

    public ChildSpecialist() {
        super();
    }

    public ChildSpecialist(int id, String name, String basicInformation, String expertise) {
        super(id, name, basicInformation);
        this.expertise = expertise;
    }

    public void printChildSpecialistDetails() {
        System.out.println("The doctor details are:");
        super.printAllDetailsOfHealthProfessional();
        System.out.println("HealthProfessional's Expertise: " + expertise);
        System.out.println("HealthProfessional Type: ChildSpecialist");
    }
}
