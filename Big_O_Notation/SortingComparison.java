import java.util.Random;

public class SortingComparison {
    public static void bubbleSort(int[] a) {
        int n = a.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (a[i - 1] > a[i]) {
                    int t = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = t;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    public static void mergeSort(int[] a, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }

    public static void merge(int[] a, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) L[i] = a[l + i];
        for (int j = 0; j < n2; j++) R[j] = a[m + 1 + j];
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) a[k++] = L[i++];
            else a[k++] = R[j++];
        }
        while (i < n1) a[k++] = L[i++];
        while (j < n2) a[k++] = R[j++];
    }

    public static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);
            quickSort(a, low, pi - 1);
            quickSort(a, pi + 1, high);
        }
    }

    public static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[i + 1];
        a[i + 1] = a[high];
        a[high] = t;
        return i + 1;
    }

    public static int[] generateRandomArray(int size) {
        int[] a = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) a[i] = r.nextInt();
        return a;
    }

    public static void main(String[] args) {
        int n = 10000;
        int[] a1 = generateRandomArray(n);
        int[] a2 = a1.clone();
        int[] a3 = a1.clone();

        long t1 = System.currentTimeMillis();
        bubbleSort(a1);
        long t2 = System.currentTimeMillis();
        System.out.println("Bubble Sort: " + (t2 - t1) + " ms");

        t1 = System.currentTimeMillis();
        mergeSort(a2, 0, a2.length - 1);
        t2 = System.currentTimeMillis();
        System.out.println("Merge Sort: " + (t2 - t1) + " ms");

        t1 = System.currentTimeMillis();
        quickSort(a3, 0, a3.length - 1);
        t2 = System.currentTimeMillis();
        System.out.println("Quick Sort: " + (t2 - t1) + " ms");
    }
}
