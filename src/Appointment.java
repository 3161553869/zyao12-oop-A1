/**
 * Appointment class represents a booking made by a patient with a health professional.
 * Author: Zhyang Yao
 * Username: zyao12
 */

public class Appointment {
    private String patientName; // Name of the patient
    private String mobilePhone; // Patient's mobile phone number
    private String timeSlot; // Time slot of the appointment
    private HealthProfessional doctor; // Health professional assigned to the appointment

    /**
     * Default constructor initializing default values for an appointment.
     */
    public Appointment() {
        this.patientName = "Unknown";
        this.mobilePhone = "0000000000";
        this.timeSlot = "00:00";
        this.doctor = null;
    }

    /**
     * Parameterized constructor for creating a new appointment with specific details.
     *
     * @param patientName  Name of the patient
     * @param mobilePhone  Mobile phone number of the patient
     * @param timeSlot     Time slot for the appointment
     * @param doctor       Health professional assigned to this appointment
     */
    public Appointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    /**
     * Gets the patient's mobile phone number for the appointment.
     *
     * @return The mobile phone number of the patient
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Prints the details of the appointment, including patient information and assigned doctor details.
     */
    public void printDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile Phone: " + mobilePhone);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Doctor Details:");
        if (doctor != null)
            doctor.printDetails(); // Print details of the assigned doctor
        else
            System.out.println("No doctor assigned.");
    }
}
