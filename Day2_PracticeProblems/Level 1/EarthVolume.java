public class EarthVolume {
    public static void main(String[] args) {
        // Constants
        double radiusKm = 6378; // radius in kilometers
        double pi = Math.PI;

        // Calculate volume in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Conversion factor from km^3 to miles^3
        // 1 km = 0.621371 miles
        // So, 1 km^3 = (0.621371)^3 miles^3
        double conversionFactor = Math.pow(0.621371, 3);

        // Calculate volume in cubic miles
        double volumeMiles3 = volumeKm3 * conversionFactor;

        // Output the results
        System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f%n", volumeKm3, volumeMiles3);
    }
}