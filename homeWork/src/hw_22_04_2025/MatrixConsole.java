package hw_22_04_2025;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MatrixConsole {
    public static void main(String[] args) {

        int[][] array1 = new int[3][3];
        int[][] array2 = new int[3][3];

        Random random = new Random();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:\n 1. Заполнить случайно\n 2. Вывести\n " +
                "3. Найти все простые элементы\n 4. Сложить с другой матрицей\n " +
                "0. Выход");
        String number = scanner.nextLine();

        switch (number) {
            case "1":
                for (int i = 0; i < array1.length; i++) {
                    for (int j = 0; j < array1.length; j++) {
                        array1[i][j] = random.nextInt(10);
                    }
                }
                break;
            case "2":
                for (int i = 0; i < array1.length; i++) {
                    for (int j = 0; j < array1.length; j++) {

                    }
                    System.out.println(Arrays.deepToString(array1));
                }
                break;
            case "3":
                int num = 0;
                for (int i = 0; i < array1.length; i++) {
                    for (int j = 0; j < array1.length; j++) {
                        if (array1[i][j] % ){
                            num = array1[i][j];
                            System.out.println(num);
                        }
                    }
                }
                break;
            case "4":

                break;
            case "5":
                System.out.println("До встречи!");
                break;
            default:
                System.out.println("Вы ввели неверное число!");

        }

    }



}
