// Program to calculate volume of Earth in km^3 and miles^3
class EarthVolumeCalculator {
    public static void main(String[] args) {
        // Fixed values
        double radiusKm = 6378;
        double kmToMiles = 1.6;

        // Calculate volume in km^3
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Convert radius to miles
        double radiusMiles = radiusKm / kmToMiles;

        // Calculate volume in miles^3
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        // Display result
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                " and cubic miles is " + volumeMiles3);
    }
}