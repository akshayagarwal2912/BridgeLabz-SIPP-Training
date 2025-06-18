import java.util.*;

public class MatrixManipulation {

    // Generate a random matrix
    public static double[][] generateMatrix(int rows, int cols) {
        double[][] mat = new double[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = 1 + rand.nextInt(9);  // Values 1–9

        return mat;
    }

    // Display matrix
    public static void printMatrix(double[][] mat) {
        for (double[] row : mat) {
            for (double val : row) {
                System.out.printf("%.2f\t", val);
            }
            System.out.println();
        }
    }

    // Transpose matrix
    public static double[][] transposeMatrix(double[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        double[][] transposed = new double[cols][rows];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transposed[j][i] = mat[i][j];

        return transposed;
    }

    // Determinant of 2x2 matrix
    public static double determinant2x2(double[][] mat) {
        return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
    }

    // Determinant of 3x3 matrix
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1]*m[2][2] - m[1][2]*m[2][1])
             - m[0][1] * (m[1][0]*m[2][2] - m[1][2]*m[2][0])
             + m[0][2] * (m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] mat) {
        double det = determinant2x2(mat);
        if (det == 0) return null;

        double[][] inv = new double[2][2];
        inv[0][0] = mat[1][1] / det;
        inv[0][1] = -mat[0][1] / det;
        inv[1][0] = -mat[1][0] / det;
        inv[1][1] = mat[0][0] / det;
        return inv;
    }

    // Inverse of 3x3 matrix
    public static double[][] inverse3x3(double[][] mat) {
        double det = determinant3x3(mat);
        if (det == 0) return null;

        double[][] inv = new double[3][3];

        // Cofactor matrix
        inv[0][0] =  (mat[1][1]*mat[2][2] - mat[1][2]*mat[2][1]);
        inv[0][1] = -(mat[1][0]*mat[2][2] - mat[1][2]*mat[2][0]);
        inv[0][2] =  (mat[1][0]*mat[2][1] - mat[1][1]*mat[2][0]);

        inv[1][0] = -(mat[0][1]*mat[2][2] - mat[0][2]*mat[2][1]);
        inv[1][1] =  (mat[0][0]*mat[2][2] - mat[0][2]*mat[2][0]);
        inv[1][2] = -(mat[0][0]*mat[2][1] - mat[0][1]*mat[2][0]);

        inv[2][0] =  (mat[0][1]*mat[1][2] - mat[0][2]*mat[1][1]);
        inv[2][1] = -(mat[0][0]*mat[1][2] - mat[0][2]*mat[1][0]);
        inv[2][2] =  (mat[0][0]*mat[1][1] - mat[0][1]*mat[1][0]);

        // Transpose of cofactor matrix (adjugate) divided by determinant
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                inv[i][j] = Math.round((inv[i][j] / det) * 100.0) / 100.0;

        return transposeMatrix(inv);
    }

    public static void main(String[] args) {
        // Choose 2x2 or 3x3 matrix
        int size = 3;
        double[][] matrix = generateMatrix(size, size);

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        System.out.println("\nTranspose:");
        printMatrix(transposeMatrix(matrix));

        if (size == 2) {
            double det = determinant2x2(matrix);
            System.out.println("\nDeterminant: " + det);

            double[][] inv = inverse2x2(matrix);
            if (inv != null) {
                System.out.println("\nInverse:");
                printMatrix(inv);
            } else {
                System.out.println("\nInverse does not exist (Det = 0)");
            }

        } else if (size == 3) {
            double det = determinant3x3(matrix);
            System.out.println("\nDeterminant: " + det);

            double[][] inv = inverse3x3(matrix);
            if (inv != null) {
                System.out.println("\nInverse:");
                printMatrix(inv);
            } else {
                System.out.println("\nInverse does not exist (Det = 0)");
            }
        }
    }
}
