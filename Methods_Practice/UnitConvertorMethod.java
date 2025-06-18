public class UnitConvertorMethod {

    // Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    // Convert Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // Convert Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // Convert Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    // Main method just for demo (optional)
    public static void main(String[] args) {
        System.out.println("100 F to C: " + convertFahrenheitToCelsius(100));
        System.out.println("0 C to F: " + convertCelsiusToFahrenheit(0));
        System.out.println("150 lb to kg: " + convertPoundsToKilograms(150));
        System.out.println("70 kg to lb: " + convertKilogramsToPounds(70));
        System.out.println("10 gallons to liters: " + convertGallonsToLiters(10));
        System.out.println("5 liters to gallons: " + convertLitersToGallons(5));
    }
}
