import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String to be Checked");
        String str = scn.nextLine();
        int n = str.length();
        String rev = "";
        for(int i = n - 1; i >= 0; i--){
            rev += str.charAt(i);
        }
        if(str == rev){
            System.out.println("The String " + str + " is a Palindrome");
        } else {
            System.out.println("The String " + str + " is not a Palindrome");
        }
    }
}
