public class StringConcatPerformance {
    public static void main(String[] args) {
        int N = 100000;

        long start, end;

        // String
        start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < N; i++) s += "a";
        end = System.currentTimeMillis();
        System.out.println("String Time: " + (end - start) + " ms");

        // StringBuilder
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) sb.append("a");
        end = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (end - start) + " ms");

        // StringBuffer
        start = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < N; i++) sbf.append("a");
        end = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (end - start) + " ms");
    }
}
