package array;

import java.util.Scanner;

public class Demo28MatrixTranspose {
    public static void main(String[] args) {
        //accept the matrix
        int[][] matrix = acceptMatrix();
        printMatrix(matrix);
        int[][] transposed = transpose(matrix);
        System.out.println("after transpose");
        printMatrix(transposed);
    }

    private static int[][] transpose(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                transpose[row][column] = matrix[column][row];
            }
        }

        return transpose;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] tempArray : matrix) {
            for (int temp : tempArray) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }

    private static int[][] acceptMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int numberOfRows = scanner.nextInt();
        System.out.println("Enter the number of columns");
        int numberOfColumns = scanner.nextInt();

        int[][] matrix = new int[numberOfRows][numberOfColumns];

        System.out.println("Enter the matrix elements ");

        for (int row = 0; row < numberOfRows; row++) {
            for (int column = 0; column < numberOfColumns; column++) {
                matrix[row][column] = scanner.nextInt();
            }
        }
        return matrix;
    }
}
