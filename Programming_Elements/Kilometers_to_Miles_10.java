import java.util.Scanner;

public class Kilometers_to_Miles_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double kilometers = sc.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
    }
}
