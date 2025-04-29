package hw_22_04_2025;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MatrixConsole {
    public static void main(String[] args) {

        int[][] matrix = new int[3][3];

        Scanner scanner = new Scanner(System.in);

        while (true){

            printMenu();
            String number = scanner.next();

            switch (number) {
                case "1":

                    System.out.println("Введите размер матрицы (x, y): ");
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    matrix = new int[x][y];

                    Random random = new Random();
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix.length; j++) {
                            matrix[i][j] = random.nextInt(10);
                        }
                    }
                    break;
                case "2":
                    for(int[] row : matrix){
                        System.out.println(Arrays.toString(row));
                    }
                    break;
                case "3":
                    System.out.println("Простые числа: ");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix.length; j++) {
                            //91
                            boolean isPrime = isPrime(matrix[i][j]);
                            if (isPrime){
                                System.out.print(matrix[i][j] +" ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case "4":
                    int rows = matrix.length;
                    int cols = matrix[0].length;

                    System.out.println("Введите " + rows*cols + " чисел: " );

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

    private static boolean isPrime(int number) {
        if(number<=2){
            return false;
        }
        boolean isPrime = true;
        for (int k = 2; k < number; k++) {
            if (number % k == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }

    private static void printMenu() {
        System.out.println(
                        "Введите число:\n " +
                        "1. Заполнить случайно\n " +
                        "2. Вывести\n " +
                        "3. Найти все простые элементы\n " +
                        "4. Сложить с другой матрицей\n " +
                        "0. Выход"
        );
    }

}
