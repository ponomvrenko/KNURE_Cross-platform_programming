package pz1.task2;

import java.util.Random;
import java.util.Scanner;

public class Task2 {

    /**
     * Дано матрицю (N+15)x(N+15), визначити чи є вона симетричною щодо головної діагоналі,
     * числа генерувати випадково в інтервалі [-N-15; N+15]
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input matrix size [N]: ");
        int N = sc.nextInt();
        int[][] matrix = generateMatrix(N);
        printMatrix(matrix);
        isSymmetric(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("%4d", matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static int[][] generateMatrix(int N) {
        int[][] matrix = new int[N + 15][N + 15];

        int min = - N - 15;
        int max = N + 15;
        int diff = max - min;
        Random rnd = new Random();

        for (int i = 0; i < N + 15; i++) {
            for (int j = 0; j < N + 15; j++) {
                matrix[i][j] = rnd.nextInt(diff + 1) + min;
            }
        }

        return matrix;
    }

    private static void isSymmetric(int[][] matrix) {
        if (matrix.length != matrix[0].length) {
            System.out.println("The given matrix is not a square matrix, so it can't be symmetric.");
        } else {
            boolean symmetric = true;

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] != matrix[j][i]) {
                        symmetric = false;
                        break;
                    }
                }
            }

            if (symmetric) {
                System.out.println("The given matrix is symmetric...");
            } else {
                System.out.println("The given matrix is not symmetric...");
            }
        }
    }
}
