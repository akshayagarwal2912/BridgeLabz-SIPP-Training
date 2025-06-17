import java.util.*;
public class WindChill {
    public static double calculateWindChill(double temperature, double windSpeed){
        double windchilll = 35.74 + (0.6215 * temperature) + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windchilll;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Temperature in *C");
        double temperature = scn.nextDouble();
        System.out.println("Enter the Wind Speed in km/h");
        double windSpeed = scn.nextDouble();
        double windchilll = calculateWindChill(temperature, windSpeed);
        System.out.println("Wind Chill = " + windchilll + " *C");
    }
}
