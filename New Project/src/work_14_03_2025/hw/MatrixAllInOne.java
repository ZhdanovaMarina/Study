package work_14_03_2025.hw;

import java.util.Scanner;

public class MatrixAllInOne {
    public static void main(String[] args) {

        int[][] matrix = initMatrix();
        printRowSums(matrix);
        printColSums(matrix);

    }

    private static int[][] initMatrix() {
        // считываем с клавиатуры число строк и сболбцов
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число строк: ");
        int rows = scanner.nextInt();
        System.out.print("Введите число столбцов: ");
        int cols = scanner.nextInt();

        // создаем двухмерный массив
        int[][] matrix = new int[rows][cols];

        //заполняем его числами
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        return matrix;

    }

    private static void printRowSums(int[][] matrix) {

        System.out.println("Суммы по строкам:");
        for (int i = 0; i < matrix[i].length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[j].length; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Строка " + i + ": " + rowSum);
        }
    }
    private static void printColSums(int[][] matrix) {

        System.out.println("Суммы по столбцам:");
        for (int j = 0; j < matrix[j].length; j++) {
            int colSum = 0;
            for (int i = 0; i < matrix[i].length; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Столбец " + j + ": " + colSum);
        }
    }
}
