package work_13_02_2025.hw;

import java.util.Arrays;

public class HW {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5, 25};
        int[] array2 = new int[]{1, 2, 3, 4, 5, 25};

/**        sumArray(array1);
        largerNumber(array1);
        int[] resultArray = multiplicationNum(array1, 2);
        System.out.println(Arrays.toString(resultArray));

        int resultNum = arrayElement(array2, 4);
        System.out.println("Индекс данного элемента массива: " + resultNum);

        int resuil = evenNumberQuantity(array2);
        System.out.println("Количество четных чисел в массиве: " + resuil);

        boolean resultSorting = sortingAnArray(array2);
        System.out.println(resultSorting);

        numberToString(array2);
*/
        int resultArithmetic = arithmeticMean(array1);
        System.out.println("Среднее арифметическое массива: " + resultArithmetic);

    }

    //1. Сумма элементов массива
    public static void sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }


    //2. Нахождение максимального элемента
    public static void largerNumber(int[] array) {
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
            }

        }
        System.out.println("Наибольший элемент в массиве: " + maxNum);

    }

//3. Умножение элементов массива на константу

    public static int[] multiplicationNum(int[] array, int constant) {

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * constant;
        }
        return array;

    }


//4. Поиск элемента в массиве

    public static int arrayElement(int[] array, int number) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }

        return -1;
    }


//5. Проверка отсортированности массива

    public static boolean sortingAnArray(int[] array) {

        boolean sorting = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;

    }


    //6. Реверс массива [3, 5, 7]
    public static int[] reverse(int[] array) {
        int[] reversed = new int[array.length];
        // [0,0,0]
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        // 1) reversed[0] = array[3 - 1 - 0]
        // 2) reversed[1] = array[3 - 1 - 1]
        // 3) reversed[2] = array[3 - 1 - 2]
        return reversed;
    }


    //7. Подсчёт чётных чисел
    public static int evenNumberQuantity(int[] array) {

        int number = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                number++;
            }
        }
        return number;

    }

    //8. Нахождение среднего арифметического
    public static int arithmeticMean(int[] array) {

        int sum = 0;
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            result = sum / array.length;

        }
        return result;
    }


    //9. Преобразование массива чисел в массив строк
    public static void numberToString(int[] array) {
        String arrayString = Arrays.toString(array);
        System.out.println(arrayString);
    }


    //10. Объединение двух массивов
    // [2,4] [5,6,7]
    public static int[] combiningArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            result[array1.length + i] = array2[i];
        }
        // 1) result[2 + 0]
        // 2) result[2 + 1]
        // 3) result[2 + 2]
        return result;
    }


}










