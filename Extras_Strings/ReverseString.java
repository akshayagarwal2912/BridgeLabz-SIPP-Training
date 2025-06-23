import java.util.*;
public class ReverseString {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter String to Reverse: ");
        String str = scn.nextLine();
        int n = str.length();
        String rev = "";
        for(int i = n - 1; i >= 0; i--){// Loop from the end to the beginning
            rev += str.charAt(i); // Append each character to the reverse string
        }
        System.out.println("Reverse of String "+ str + " is " + rev);
    }
}
