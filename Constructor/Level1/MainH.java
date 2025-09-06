package PracticeProgram4;

public class Main {
    public static void main(String[] args) {
        // Using default constructor
        HotelBookingSystem booking1 = new HotelBookingSystem();
        booking1.displayBooking();

        // Using parameterized constructor
        HotelBookingSystem booking2 = new HotelBookingSystem("John Doe", "Deluxe", 3);
        booking2.displayBooking();

        // Using copy constructor
        HotelBookingSystem booking3 = new HotelBookingSystem(booking2);
        booking3.displayBooking();
    }
}
