package work_28_03_2025.hw;

import java.util.Scanner;

public class IfElseSwitch {

    public static void main(String[] args) {

        // Лекция: Управляющие конструкции в Java


//        task();
//        task_2();  много раз делала
//        task_4();  сделано в task();
//        task_6();
//        task_8();  не понимаю, что надо писать в условие цикла
//        task_16();
//        task_18();

        task_8();



    }

    private static void task_8() {
        int num = 5;
        int result = 1;
        int result2 = 1;
        int i = 1;


        while (i <= num) {
            result *= i;
            i++;
        }

        for(int j = 1; j<=num; j++){
            result2 *= j;
        }
        System.out.println(result);
        System.out.println(result2);
    }

    private static void task_16() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 15};

        int num = 5;
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                System.out.println(num);
                break;
            }
        }
    }

    private static void task_18() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 10};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                continue;
            }
            System.out.println(array[i]);
        }
    }

    private static void task_6() {
        for (int i = 1; i <= 10; i++) {
            int a = 5;
            a = a * i;
            System.out.println(a);
        }
    }

    private static void task() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int s = scanner.nextInt();

        if (s % 2 == 0) {
            System.out.println("Число положительное!");
        } else {
            System.out.println("Число отрицательное!");
        }


        System.out.println("Введите число от 1 до 7");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("пн!");
                break;
            case 2:
                System.out.println("вт!");
                break;
            case 3:
                System.out.println("ср!");
                break;
            case 4:
                System.out.println("чт!");
                break;
            case 5:
                System.out.println("пт!");
                break;
            case 6:
                System.out.println("сб!");
                break;
            case 7:
                System.out.println("вс!");
                break;
            default:
                System.out.println("Некорректное значение!");
                break;
        }
    }

}
