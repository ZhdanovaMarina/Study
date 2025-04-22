package work_07_03_2025.hw;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int s3 = scanner.nextInt();
        int mark = scanner.nextInt();


        even(s1);
        negativeNumber(s1);
        maximumNumber(s1, s2, s3);
        grade(mark);


    }

    private static void grade(int mark) {
        if (mark == 5) {
            System.out.println("Отлично");
        } else if (mark == 4) {
            System.out.println("Хорошо");
        } else if (mark == 3) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Неудовлетворительно");
        }
    }

    private static void maximumNumber(int s1, int s2, int s3) {
        if (s1 > s2 && s1 > s3) {
            System.out.println("Самое большое число:" + s1);
        } else if (s2 > s3 && s2 > s1) {
            System.out.println("Самое большое число:" + s2);
        } else {
            System.out.println("Самое большое число:" + s3);
        }
    }

    private static void negativeNumber(int s1) {
        if (s1 > 0) {
            System.out.println("Число положительное");
        } else if (s1 < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Ноль");
        }
    }

    private static void even(int s1) {
        if (s1 % 2 == 0) {
            System.out.println("Это честное число");
        } else {
            System.out.println("Это нечетное число");
        }
    }

}
