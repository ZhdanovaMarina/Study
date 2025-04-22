package work_07_03_2025.hw;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {

        arraySum();
        minMax();

        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        int[] reversArray = reverseArray(array);
        System.out.println("Массив после реверса: " + java.util.Arrays.toString(reversArray));

        String[] array1 = new String[]{"hi", "mother", "cat", "good", "mother", "dog", "hi"};
        int numberOfElements = countOccurrences(array1, "mother");
        System.out.println("Это слово встречается в массиве " + numberOfElements + " раза.");



    }
    public static int countOccurrences(String[] array, String target){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(target)){
                count++;
            }else {

            }

        }
        return count;
    }



    public static int[] reverseArray(int[] array){
        int [] revers = new int[array.length];

        for (int i = 0; i < array.length ; i++) {
            revers[i] = array[array.length - 1 - i];

        }
        return revers;
    }

    private static void minMax() {
        int[] array = new int[]{3, 2, 5, 6, 12, 8, 111, 0, 95, 13, 7, 77, 6, 23, 14};


        int min = array[0];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

    private static void arraySum() {
        int[] array1 = new int[10];
        Random random = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(12);
        }
        System.out.println(java.util.Arrays.toString(array1));


        int sum = 0;
        int arithmetic = 0;
        for (int i = 0; i < array1.length; i++) {
            sum = sum + array1[i];
            arithmetic = array1.length;
        }
        System.out.println("Сумма всех элементов массива: " + sum);
        System.out.println("Среднее арифметическое число массива: " + (sum / arithmetic));
    }


}
