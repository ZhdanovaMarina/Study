package work_28_03_2025.hw;

import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;

public class HW {

    public static void main(String[] args) {

// Базовый синтаксис (Типы данных: примитивные и ссылочные)
//        task_2();
//        task_4();
//        task_6(); !!! ВОПРОС !!!
//        task_8();
//        task_10();
//        task_12();
//        task_14();
//        task_16();
//        task_18(); !!! ВОПРОС !!!
//        task_20();
        task_18();


    }

    private static void task_20() {
        int num = 15;
        double numD = 10.50;
        byte numB = 5;

        System.out.println((int) + (num + numD) / numB);
    }

    private static void task_18() {
        int a = 10;
        int b = a;

        System.out.println("Примитивы до изменения: ");
        System.out.println("а: " + a);
        System.out.println("b: " + b);

        a = 20;

        System.out.println("Примитивы после изменения: ");
        System.out.println("а: " + a);
        System.out.println("b: " + b);

        Task18 data1 = new Task18(100);
        Task18 data2 = data1;

        System.out.println("ссылочные типы до изменения: ");
        System.out.println("data1: " + data1.value);
        System.out.println("data2: " + data2.value);

        data1.value = 200;

        System.out.println("ссылочные типы после изменения data1: ");
        System.out.println("data1: " + data1.value);
        System.out.println("data2: " + data2.value);

        data2 = new Task18(300);

        System.out.println("ссылочные типы после изменения data2: ");
        System.out.println("data1: " + data1.value);
        System.out.println("data2: " + data2.value);
    }

    private static void task_16() {
        char[] array = {'h', 'e', 'l', 'l', 'o'};

        for (int i = 0; i < array.length; i++) {
            char c = 0;
            c = array[i];
            System.out.print(c);
        }
    }

    private static void task_14() {
        String[] array = {"Пон","Вт","Ср","Чт","Пт","Сб","Вск",};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].length());
        }
    }

    private static void task_12() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(array[0]);
        System.out.println(array.length);
    }

    private static void task_10() {
        String s = "Cat";
        String s1 = new String("Cat");

        System.out.println(s == s1);
        System.out.println(s.equals(s1));
    }

    private static void task_8() {
        double d1 = 1.11;
        double d2 = 3.33;

        double d3 = d1 + d2;
        double d4 = d1 * d2;

        System.out.println((int) + d3);
        System.out.println((int) + d4);
    }

    private static void task_6() {

        char[] array = {'H', 'e', 'l', 'l', 'o'};

        // todo  StringBuilder
        StringBuilder result = new StringBuilder();
        for (char c : array) {
            result.append(c);
        }
        System.out.println(result);
    }

    private static void task_4() {
        int c = 10;
        int c1 = 10;

        System.out.println(c + c1);
        System.out.println(c > c1);
        System.out.println(c == c1);
    }

    private static void task_2() {
        byte a = 8;
        short b = 800;
        int c = 8_000;
        int c1 = 1000;
        long d = 80_000L;
        float e = 8.08f;
        double f = 88.88;
        char g = 'D';

        String word = "Кошка";
        int[] num = {1, 2, 3, 4, 5};

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(word);

        System.out.println();
        for (int i = 0; i < num.length + 1; i++) {
            System.out.println(i);
        }
    }
}
