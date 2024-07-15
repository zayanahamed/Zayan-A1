public class HealthProfessional {

    private int id;
    private String name;
    private String basicInformation;

    // this is the defualt constructor
    public HealthProfessional() {

    }

    public HealthProfessional(int id, String name, String basicInformation) {
        this.id = id;
        this.name = name;
        this.basicInformation = basicInformation;
    }

    // THis function are used to print general details about the dr
    public void printAllDetailsOfHealthProfessional() {
        System.out.println("Doctor Id: " + id);
        System.out.println("Doctor Name: " + name);
        System.out.println("Doctor Basic Information: " + basicInformation);
    }
}
