import java.util.*;

public class SearchComparison {
    public static boolean linearSearch(int[] arr, int target) {
        for (int x : arr) {
            if (x == target) return true;
        }
        return false;
    }

    public static boolean binarySearch(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == target) return true;
            if (arr[m] < target) l = m + 1;
            else r = m - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 1000000;
        int[] data = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) data[i] = rand.nextInt(n * 10);
        int target = data[rand.nextInt(n)];

        long t1 = System.nanoTime();
        linearSearch(data, target);
        long t2 = System.nanoTime();

        Arrays.sort(data);
        long t3 = System.nanoTime();
        binarySearch(data, target);
        long t4 = System.nanoTime();

        System.out.printf("Linear Search Time: %.4f ms\n", (t2 - t1) / 1e6);
        System.out.printf("Sort + Binary Search Time: %.4f ms\n", (t4 - t3 + t3 - t2) / 1e6);
    }
}
