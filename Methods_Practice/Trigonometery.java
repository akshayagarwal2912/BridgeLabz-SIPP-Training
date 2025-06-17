import java.util.*;
public class Trigonometery {
    public static void computeAngle(double angle){
         double radians = angle * (3.14/180);// Convert degrees to radians
         double sin = Math.sin(radians);//Calculate sine, cosine, and tangent
         double cos = Math.cos(radians);
         double tan = Math.tan(radians);
         System.out.println("Sin: " + sin);
         System.out.println("Cos: " + cos);
         System.out.println("Tan: " + tan);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the angle in Degrees");
        double angle = scn.nextDouble();
        computeAngle(angle);
    }
}
