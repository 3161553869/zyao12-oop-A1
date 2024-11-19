/**
 * Author: Zhaoyang Yao
 * Username: zyao12
 */
public class HealthProfessional {
    private int id;
    private String name;
    private String specialization;

    /**
     * Default constructor that initializes a HealthProfessional with default values.
     * The id is set to 0, name is set to "Unknown", and specialization is set to "General".
     */
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.specialization = "General";
    }

    /**
     * Constructor that initializes a HealthProfessional with specified values.
     *
     * @param id            ID of the health professional
     * @param name          Name of the health professional
     * @param specialization Specialization of the health professional
     */
    public HealthProfessional(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    /**
     * Prints the details of the HealthProfessional including id, name, and specialization.
     */
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
    }

    /**
     * Gets the ID of the HealthProfessional.
     *
     * @return The id of the health professional.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the name of the HealthProfessional.
     *
     * @return The name of the health professional.
     */
    public String getName() {
        return name;
    }
}
