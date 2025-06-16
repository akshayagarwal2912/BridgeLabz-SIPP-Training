import java.util.*;
public class VotingOrNot {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the age of 10 persons to check if they can vote or not:");
        int[] ages = new int[10];
        for(int i = 0; i < ages.length;i++){
            ages[i] = scn.nextInt();
            if(ages[i] > 18){
                System.out.println("Person with age " + ages[i] + " can vote");
            }
            else if(ages[i] == 18){
                System.out.println("Person with age 18 can vote");
            }
            else{
                System.out.println("Person with age " + ages[i] + " cannot vote");
            }
        }
    }
}
