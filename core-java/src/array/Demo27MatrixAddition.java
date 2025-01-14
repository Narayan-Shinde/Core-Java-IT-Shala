package array;

import java.util.Scanner;

public class Demo27MatrixAddition {
    public static void main(String[] args) {
        //accept the matrix
        int[][] matrix1 = acceptMatrix();
        int[][] matrix2 = acceptMatrix();
        int[][] addition = addMatrices(matrix1, matrix2);
        printMatrix(addition);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] tempArray : matrix) {
            for (int temp : tempArray) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }

    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] addition = new int[matrix1.length][matrix1[0].length];

        for (int row = 0; row < matrix1.length; row++) {
            for (int column = 0; column < matrix1[row].length; column++) {
                addition[row][column] = matrix1[row][column] + matrix2[row][column];
            }
        }

        return addition;
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
