import java.util.ArrayList;
/**
 * Author: Zhaoyang Yao
 * Username: zyao12
 */
public class AssignmentOne {
    // Declare an ArrayList to store appointments
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    /**
     * Creates a new appointment and adds it to the appointments list.
     * Checks if all required information is provided.
     *
     * @param patientName  Name of the patient
     * @param mobilePhone  Mobile phone number of the patient
     * @param timeSlot     Time slot of the appointment
     * @param doctor       Health professional assigned to the appointment
     */
    public static void createAppointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional doctor) {
        if (patientName == null || mobilePhone == null || timeSlot == null || doctor == null) {
            System.out.println("Error: Missing required phone number for the appointment.");
            return;
        }
        appointments.add(new Appointment(patientName, mobilePhone, timeSlot, doctor));
    }

    /**
     * Prints the details of all existing appointments.
     * If no appointments are available, it prints a message indicating that.
     */
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
            return;
        }
        for (Appointment appointment : appointments) {
            System.out.println("------------------------------");
            appointment.printDetails();
        }
    }

    /**
     * Cancels an appointment by matching the mobile phone number.
     * If no appointment is found for the given mobile number, it prints an error message.
     *
     * @param mobilePhone  Mobile phone number to search for the appointment
     */
    public static void cancelBooking(String mobilePhone) {
        for (Appointment appointment : appointments) {
            if (appointment.getMobilePhone().equals(mobilePhone)) {
                appointments.remove(appointment);
                System.out.println("Appointment canceled successfully for mobile: " + mobilePhone);
                return;
            }
        }
        System.out.println("No appointment found for the mobile phone: " + mobilePhone);
    }

    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        System.out.println("// Part 3 – Using classes and objects");

        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Smith", "General Medicine", "Clinic A");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Taylor", "Family Health", "Clinic B");
        Specialist sp1 = new Specialist(3, "Dr. Brown", "Cardiology", "Heart Specialist");
        Specialist sp2 = new Specialist(4, "Dr. Brain", "Gastroenterology", "Gastroenterology Specialist");

        gp1.printDetails();
        gp2.printDetails();
        sp1.printDetails();
        sp2.printDetails();
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        System.out.println("// Part 5 – Collection of appointments");

        createAppointment("Alice", "1234567890", "10:00", gp1);
        createAppointment("Bob", "9876543210", "11:00", gp2);
        createAppointment("Charlie", "5555555555", "14:00", sp1);
        createAppointment("David", "5556667778", "03:00", sp2);

        System.out.println("Existing Appointments:");
        printExistingAppointments();

        cancelBooking("1234567890");
        cancelBooking("0000");
        System.out.println("Updated Appointments:");
        printExistingAppointments();
        System.out.println("------------------------------");
    }
}
