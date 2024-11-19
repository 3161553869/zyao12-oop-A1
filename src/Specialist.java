/**
 * Author: Zhaoyang Yao
 * Username: zyao12
 */
public class Specialist extends HealthProfessional {
    private String expertise;

    /**
     * Default constructor that initializes a Specialist with default values.
     * Calls the parent constructor to set default id, name, and specialization.
     * The expertise is set to "General Specialist".
     */
    public Specialist() {
        super();
        this.expertise = "General Specialist";
    }

    /**
     * Constructor that initializes a Specialist with specified values.
     *
     * @param id            ID of the specialist
     * @param name          Name of the specialist
     * @param specialization Specialization of the specialist
     * @param expertise     Area of expertise for the specialist
     */
    public Specialist(int id, String name, String specialization, String expertise) {
        super(id, name, specialization);
        this.expertise = expertise;
    }

    /**
     * Prints the details of the Specialist, including inherited details from HealthProfessional
     * and the specific expertise of the specialist.
     */
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Type: Specialist");
        System.out.println("Expertise: " + expertise);
    }

    /**
     * Gets the availability of the Specialist.
     *
     * @return The working hours of the specialist.
     */
    public String getAvailability() {
        return "Available from 9:00 AM to 5:00 PM";
    }
}
