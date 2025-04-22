package work_11_02_2025;

import work_21_02_2025.Person;

import java.util.Arrays;

public class HW {
    public static void main(String[] args) {

//1 Проверка, отсортирован ли массив по возрастанию

        int[] array = new int[]{1, 20, 30, 40, 50, 6, 9};

        boolean isValidArray = task1(array);
        /*
        if( 5>3){
            "верно"
        }else{
            "ошибка"
        }

        (5>3) ? "верно" : "ошибка"
         */
        System.out.println(isValidArray ? "Отсортирован коректно" : "Ошибка");
        System.out.println("========================");

//2 Подсчет количества четных и нечетных чисел в массиве

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }


        }
        System.out.println("Четных чисел: " + evenCount);
        System.out.println("Нечетных чисел: " + oddCount);

        System.out.println("========================");

//3   Вычисление среднего арифметического элементов массива

        double sum = 0;
        double averageSum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            averageSum = sum / array.length;
        }
        System.out.println("Среднее арифметическое элементов массива: " + averageSum);

        System.out.println("========================");

//4   Нахождение второго наибольшего элемента в массиве


//5   Умножение элементов массива, удовлетворяющих условию

        int threshold = 2;
        int num = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > threshold) {
                num = num * array[i];
            }
        }
        System.out.println("Результат умножения: " + num);

        System.out.println("========================");


//6   Проверка списка на наличие дубликатов


//7   Подсчет строк, начинающихся с гласной буквы

//8   Проверка, что все элементы массива положительные
/**     for (int i = 0; i < array.length; i++) {
 if (array[i] > 0) {

 } else {
 return;
 }
 } System.out.println("Все элементы массива положительные!");
 */

        System.out.println("========================");

//9   Поиск первого элемента, делящегося на 5

        int number = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0) {
                number = number + array[i];
                System.out.println("Первое число, делящееся на 5 без остатка: " + number);
                break;
            }
            System.out.println("Такие элементы отсутствуют.");
        }


        System.out.println("========================");


//10  Сумма элементов массива, кратных 3

        int sum3 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                sum3 = sum3 + array[i];

            }
        }
        System.out.println("Сумма элементов массива, кратных 3: " + sum3);

        System.out.println("========================");
    }

    private static boolean task1(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] > array[i + 1]) {
                return false;
            }

        }

        return true;
    }

    private static void task4(int[] array) {

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {

            if (array[i] > firstMax) {
                secondMax = firstMax;
                firstMax = array[i];
            } else if (array[i] > secondMax) {
                secondMax = array[i];
            }

        }

    }

    private static boolean task8(int[] array) {

        for (int i = 0; i < array.length; i++) {

           if(array[i] < 0) {
               System.out.println("Массив некорректен");
               return false;
           }

        }

        System.out.println("Массив корректен");
        return true;

    }
}


























