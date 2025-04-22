package work_14_03_2025;

import java.util.Scanner;

public class Good {
    public static void main(String[] args) {

        int[] array = initArray();

        int sum = calcSum(array);
        int min = findMin(array);
        int max = findMax(array);
        double average = calcAverage(array);

        printResult(sum, min, max, average);
    }

    private static int[] initArray(){
        Scanner scanner = new Scanner(System.in);

        //Считываем размер массива
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        // создание массива
        int[] array = new int[n];

        // считываются элементы массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        return array;
    }

    private static int calcSum(int[] array){
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum;
    }
    private static int findMax(int[] array){

        int max = Integer.MIN_VALUE;
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int elem : array) {
            if (elem < min) {
                min = elem;
            }
        }
        return min;
    }

    private static double calcAverage(int[] array){
        double average = 0;
        if (array.length > 0) {
            average = (double) calcSum(array) / array.length;
        }
        return average;
    }

    private static void printResult(int sum, int min, int max, double average){
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее значение: " + average);
        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);
    }
}
