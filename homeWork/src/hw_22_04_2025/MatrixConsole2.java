package hw_22_04_2025;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MatrixConsole2 {
    public static void main(String[] args) {

        int[][] matrix = new int[2][2];

        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();

            String number = scanner.nextLine();

            switch (number) {
                case "1":
                    Random random = new Random();
                    matrix = newMatrix(scanner);

                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix.length; j++) {
                            matrix[i][j] = random.nextInt(10);
                        }
                    }
                    break;
                case "2":

                    for (int[] num : matrix) {
                        System.out.println(Arrays.toString(num));
                    }
                    break;
                case "3":
                    System.out.println("Простые числа: ");
                    if (matrix == null) {
                        System.out.println("Матрица не может быть пустой");
                        continue;
                    }
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix.length; j++) {
                            boolean isPrime = isPrime(matrix[i][j]);
                            if (isPrime) {
                                System.out.println(matrix[i][j] + " ");
                            }
                        }
                    }

                    break;
                case "4":

                    int rows = matrix.length;
                    int cols = matrix[0].length;

                    System.out.println("Введите " + rows * cols + " чисел: ");

                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix.length; j++) {
                            matrix[i][j] += scanner.nextInt();
                        }
                    }
                    break;
                case "0":
                    System.out.println("До встречи!");
                    return;
                default:
                    System.out.println("Вы ввели неверное число!");
            }


        }


    }

    private static int[][] newMatrix(Scanner scanner) {

        System.out.println("Введите размер матрицы х/у: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int[][] matrix = new int[x][y];
        return matrix;
    }

    private static void printMenu() {
        System.out.println("Введите число:\n" +
                "1 Заполнить случайно\n" +
                "2 Вывести\n" +
                "3 Найти все простые элементы\n" +
                "4 Сложить с другой матрицей\n" +
                "0 Выход");
    }

    public static boolean isPrime(int number) {
        if (number <= 2) {
            return false;
        }
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}
