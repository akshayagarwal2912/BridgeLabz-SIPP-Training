import java.util.Scanner;
public class Celsius_to_Fahrenheit_3 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double celsius = sc.nextDouble(); 
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
    }
    
}