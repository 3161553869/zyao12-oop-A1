/**
 * Author: Zhaoyang Yao
 * Username: zyao12
 */
public class GeneralPractitioner extends HealthProfessional {
    private String clinic;

    /**
     * Default constructor that initializes the GeneralPractitioner with default values.
     * Calls the superclass constructor and sets the clinic to "Default Clinic".
     */
    public GeneralPractitioner() {
        super();
        this.clinic = "Default Clinic";
    }

    /**
     * Constructor that initializes the GeneralPractitioner with specified values.
     * Calls the superclass constructor to initialize id, name, and specialization.
     *
     * @param id        ID of the health professional
     * @param name      Name of the health professional
     * @param specialization Specialization of the health professional
     * @param clinic    Clinic where the practitioner works
     */
    public GeneralPractitioner(int id, String name, String specialization, String clinic) {
        super(id, name, specialization);
        this.clinic = clinic;
    }

    /**
     * Prints the details of the GeneralPractitioner including their type and clinic.
     * Calls the superclass printDetails method to print common information.
     */
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Type: General Practitioner");
        System.out.println("Clinic: " + clinic);
    }

    /**
     * Returns the availability hours of the General Practitioner.
     *
     * @return A string indicating the availability time range.
     */
    public String getAvailability() {
        return "Available from 12:00 AM to 3:00 PM";
    }
}
