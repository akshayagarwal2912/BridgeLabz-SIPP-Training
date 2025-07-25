import java.util.*;
public class ReverseLL {
    public static void main(String[] args){
        
        Scanner scn = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        
        System.out.println("Enter the number of elements");
        int n = scn.nextInt();
        
        for(int i = 0; i < n; i++){
            System.out.println("Enter the " + (i+1) +" element ");
            int value = scn.nextInt();
            list.add(value);
        }
        
        System.out.println("List before Reverse: " + list);
        
        List<Integer> newList = new ArrayList<>();
        
        for(int i = n - 1; i >= 0; i--){
        int val = list.get(i);
            newList.add(val);
        }
        
        System.out.println("List after Reverse: " + newList);
        
    }
}
