public class PenDistribution {
    public static void main(String[] args) {
        int totalPens = 14;// Example total number of pens
        int students = 3;// Example number of students
        int pensPerStudent = totalPens / students;// Calculate pens per student by dividing total pens by number of students
        int remainingPens = totalPens % students;// Calculate remaining pens by using modulus operator
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}