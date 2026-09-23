/*
 * Program to perform matrix addition, subtraction, multiplication,
 * transpose, determinant, and inverse operations.
 */

package Methods.Level3;

import java.util.Random;

class MatrixOperations {

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int columns) {
        Random random = new Random();
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(9) + 1;
            }
        }

        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    // Method to find transpose
    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    // Method to find determinant of 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1]
                - matrix[0][1] * matrix[1][0];
    }

    // Method to find determinant of 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Method to find inverse of 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        int determinant = determinant2x2(matrix);

        if (determinant == 0) {
            return null;
        }

        double[][] inverse = new double[2][2];

        inverse[0][0] = (double) matrix[1][1] / determinant;
        inverse[0][1] = (double) -matrix[0][1] / determinant;
        inverse[1][0] = (double) -matrix[1][0] / determinant;
        inverse[1][1] = (double) matrix[0][0] / determinant;

        return inverse;
    }

    // Method to find inverse of 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix) {
        int determinant = determinant3x3(matrix);

        if (determinant == 0) {
            return null;
        }

        double[][] inverse = new double[3][3];

        inverse[0][0] = (double) (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) / determinant;
        inverse[0][1] = (double) (matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2]) / determinant;
        inverse[0][2] = (double) (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]) / determinant;

        inverse[1][0] = (double) (matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2]) / determinant;
        inverse[1][1] = (double) (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]) / determinant;
        inverse[1][2] = (double) (matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2]) / determinant;

        inverse[2][0] = (double) (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]) / determinant;
        inverse[2][1] = (double) (matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1]) / determinant;
        inverse[2][2] = (double) (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]) / determinant;

        return inverse;
    }

    // Method to display integer matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to display double matrix
    public static void displayMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%.2f\t", matrix[i][j]);
            }
            System.out.println();
        }
    }
}

public class MatrixManipulation {

    public static void main(String[] args) {

        int[][] matrix1 = MatrixOperations.createRandomMatrix(3, 3);
        int[][] matrix2 = MatrixOperations.createRandomMatrix(3, 3);

        System.out.println("Matrix 1:");
        MatrixOperations.displayMatrix(matrix1);

        System.out.println("\nMatrix 2:");
        MatrixOperations.displayMatrix(matrix2);

        System.out.println("\nAddition:");
        MatrixOperations.displayMatrix(
                MatrixOperations.addMatrices(matrix1, matrix2));

        System.out.println("\nSubtraction:");
        MatrixOperations.displayMatrix(
                MatrixOperations.subtractMatrices(matrix1, matrix2));

        System.out.println("\nMultiplication:");
        MatrixOperations.displayMatrix(
                MatrixOperations.multiplyMatrices(matrix1, matrix2));

        System.out.println("\nTranspose:");
        MatrixOperations.displayMatrix(
                MatrixOperations.transposeMatrix(matrix1));

        System.out.println("\nDeterminant of Matrix 1:");
        System.out.println(MatrixOperations.determinant3x3(matrix1));

        double[][] inverse = MatrixOperations.inverse3x3(matrix1);

        if (inverse != null) {
            System.out.println("\nInverse of Matrix 1:");
            MatrixOperations.displayMatrix(inverse);
        } else {
            System.out.println("\nMatrix 1 has no inverse.");
        }
    }
}