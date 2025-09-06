package PracticeProgram6;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Standard";
        this.rentalDays = 1;
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        System.out.println("Parameterized constructor called");
    }

    // Method to calculate cost based on car model
    public double calculateTotalCost() {
        double ratePerDay;

        switch (carModel.toLowerCase()) {
            case "sedan":
                ratePerDay = 2000;
                break;
            case "suv":
                ratePerDay = 3000;
                break;
            case "luxury":
                ratePerDay = 5000;
                break;
            default:
                ratePerDay = 1500; // Standard car
        }

        return rentalDays * ratePerDay;
    }

    // Display booking details
    public void displayRental() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
        System.out.println("--------------------------");
    }
}
