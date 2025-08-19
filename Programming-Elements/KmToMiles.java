// Program to convert kilometers to miles
class KmToMiles {
    public static void main(String[] args) {
        // Fixed value
        double kilometers = 10.8;
        double kmToMilesRate = 1.6;

        // Calculate miles
        double miles = kilometers / kmToMilesRate;

        // Display result
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}