package PracticeLucky3;

public class Vehicle {
    // Instance Variables
    private String ownerName;
    private String vehicleType;

    // Class Variable (common for all vehicles)
    private static double registrationFee = 5000.0; // default fee

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance Method → to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
        System.out.println("-----------------------------");
    }

    // Class Method (Static) → to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

