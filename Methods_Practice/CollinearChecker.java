public class CollinearChecker {

    // Method using slope formula
    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // (y2 - y1)/(x2 - x1) == (y3 - y1)/(x3 - x1)
        // Cross multiply to avoid divide by zero
        return (y2 - y1) * (x3 - x1) == (y3 - y1) * (x2 - x1);
    }

    // Method using area of triangle formula
    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }

    public static void main(String[] args) {
        // Sample Points: A(2,4), B(4,6), C(6,8)
        int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;

        System.out.println("Points: A(" + x1 + "," + y1 + "), B(" + x2 + "," + y2 + "), C(" + x3 + "," + y3 + ")");

        boolean slopeCheck = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear (Slope Method)? " + slopeCheck);

        boolean areaCheck = areCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear (Area Method)? " + areaCheck);
    }
}
