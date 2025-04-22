package work_28_03_2025.hw;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

//        task_2();
//        task_4(); (хз что получилось)
//        task_6();
//        task_12();
//        task_14();
//        task_16();
//        task_18(); !!! делала то же самое в task_12()




    }

    private static void task_16() {
        int a = 2;
        int b = 10;
        int c = 2;
        int d = ((b / 2) + (c * a)) + 10;
        System.out.println(d);
    }

    private static void task_14() {
        int a = 10;
        a += 10;
        System.out.println(a);
        a /= 5;
        System.out.println(a);
        a %= 2;
        System.out.println(a);
    }

    private static void task_12() {
        int a = 9;
        if (a % 2 == 0){
            System.out.println("Число четное!");
        }else {
            System.out.println("Число нe четное!");
        }
    }

    private static void task_6() {
        int a = 2;
        int b = 5;

        System.out.println("Изначально переменная равна " + a);
        System.out.println("Переменная после изменения " + ++a);

        System.out.println("Изначально переменная равна " + b);
        b++;
        System.out.println("Переменная после изменения " + b);
    }

    private static void task_4() {
        int a = 10;
        int b = 5;


        switch ("<") {
            case "==":
                if (a == b){
                    System.out.println(a + " = " + b);
                }else{
                    System.out.println(a + " != " + b);
                }
                break;
            case "!=":
                if (a != b){
                    System.out.println(a + " != " + b);
                }
                break;
            case ">":
                if (a > b){
                    System.out.println(a + " > " + b);
                } else {
                    System.out.println(a + " < " + b);
                }
                break;
            case "<":
                if (a < b){
                    System.out.println(a + " < " + b);
                }else {
                    System.out.println(a + " > " + b);
                }
                break;
            default:
                System.out.println("Неизвестный оператор!");
        }
    }

    private static void task_2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();

        System.out.println("Введите оператор (+, -, *, /, %) : ");
        char с = scanner.next().charAt(0);

        int result;
        switch (с) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Делить на ноль нельзя!");
                    return;
                }
                result = a / b;
                break;
            case '%':
                if (b == 0) {
                    System.out.println("Делить на ноль нельзя!");
                    return;
                }
                result = a % b;
                break;
            default:
                System.out.println("Неизвестный оператор!");
                return;
        }
        System.out.println(result);
    }

}
