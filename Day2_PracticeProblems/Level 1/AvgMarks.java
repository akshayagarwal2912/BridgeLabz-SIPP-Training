public class AvgMarks {
    public static void main(String[] args) {
        int math = 94; //Maths marks
        int physics = 95;// Physics marks
        int chemistry = 96;// Chemistry marks
        int total = math + physics + chemistry;// Total marks in PCM
        int numberOfSubjects = 3;// Number of subjects in PCM
        double average = (double) total / numberOfSubjects;// Average marks in PCM
        System.out.println("Sam’s average mark in PCM is " + average);//
    }
}