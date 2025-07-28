import java.util.*;

public class StudentMarksReport {
    public static void main(String[] args) {
        Map<String, List<Integer>> marksMap = new HashMap<>();

        // Add marks
        addMarks(marksMap, "Amit", Arrays.asList(85, 90, 80));
        addMarks(marksMap, "Neha", Arrays.asList(75, 95, 85));
        addMarks(marksMap, "Raj", Arrays.asList(70, 60, 65));

        // Show average marks
        for (String name : marksMap.keySet()) {
            double avg = getAverage(marksMap.get(name));
            System.out.println(name + "'s average: " + avg);
        }

        // Get top student
        String topStudent = getTopStudent(marksMap);
        System.out.println("\nTop performer: " + topStudent);
    }

    // Method to add marks
    public static void addMarks(Map<String, List<Integer>> map, String name, List<Integer> marks) {
        map.putIfAbsent(name, new ArrayList<>());
        map.get(name).addAll(marks);
    }

    // Method to calculate average
    public static double getAverage(List<Integer> marks) {
        if (marks.isEmpty()) return 0;
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.size();
    }

    // Method to get top-performing student
    public static String getTopStudent(Map<String, List<Integer>> map) {
        String topName = "";
        double highestAvg = 0;

        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            double avg = getAverage(entry.getValue());
            if (avg > highestAvg) {
                highestAvg = avg;
                topName = entry.getKey();
            }
        }
        return topName;
    }
}
