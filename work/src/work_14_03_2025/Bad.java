package work_14_03_2025;

import java.util.Scanner;

public class Bad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Считываем размер массив
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        // создание массива
        int[] array = new int[n];

        // считываются элементы массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // ищем сумму, минимальное, максимальное
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            sum += array[i];
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        // считаем среднее
        double average = 0;
        if (n > 0) {
            average = (double) sum / n;
        }

        // выводим результаты
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее значение: " + average);
        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);

        // закрытие сканера
        scanner.close();
    }
}
