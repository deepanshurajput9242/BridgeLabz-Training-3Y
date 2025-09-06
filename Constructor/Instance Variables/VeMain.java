package PracticeLucky3;

public class Main {
    public static void main(String[] args) {
        // Creating Vehicle objects
        Vehicle v1 = new Vehicle("Rahul Sharma", "Car");
        Vehicle v2 = new Vehicle("Anita Singh", "Bike");

        // Display vehicle details (using instance method)
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee (using class method)
        Vehicle.updateRegistrationFee(7000.0);

        System.out.println("After Updating Registration Fee:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

