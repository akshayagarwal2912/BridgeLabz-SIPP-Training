import java.util.*;
public class Table {
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the number for which you want the multiplication table:");
    int n = scn.nextInt();
    for(int i = 1; i <= 10; i++){
        System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
