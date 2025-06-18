import java.util.*;

public class MatrixOperations {

    // Method to generate a random matrix with values between 1 and 9
    public static int[][] generateMatrix(int rows, int cols) {
        int[][] mat = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = 1 + rand.nextInt(9);
            }
        }
        return mat;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = B[0].length;
        int common = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 3, cols = 3;

        int[][] matrix1 = generateMatrix(rows, cols);
        int[][] matrix2 = generateMatrix(rows, cols);

        System.out.println("Matrix A:");
        printMatrix(matrix1);
        System.out.println("\nMatrix B:");
        printMatrix(matrix2);

        System.out.println("\nAddition (A + B):");
        printMatrix(addMatrices(matrix1, matrix2));

        System.out.println("\nSubtraction (A - B):");
        printMatrix(subtractMatrices(matrix1, matrix2));

        System.out.println("\nMultiplication (A * B):");
        printMatrix(multiplyMatrices(matrix1, matrix2));
    }
}
