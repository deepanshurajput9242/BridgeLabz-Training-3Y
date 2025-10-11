package PracticeProgram4;

public class HotelBookingSystem {
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBookingSystem() {
        this.guestName = "Unknown Guest";
        this.roomType = "Standard";
        this.nights = 1;
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    public HotelBookingSystem(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
        System.out.println("Parameterized constructor called");
    }

    // Copy constructor
    public HotelBookingSystem(HotelBookingSystem other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
        System.out.println("Copy constructor called");
    }

    // Method to display booking details
    public void displayBooking() {
        System.out.println("Guest: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("----------------------");
    }
}
