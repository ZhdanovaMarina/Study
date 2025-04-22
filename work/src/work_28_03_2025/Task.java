package work_28_03_2025;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        /*
        1.1 ссылочные типы хранят в себе ссылку на объект, а примитичные - значение
        1.2 примитивные переменные хранятся в стеке, а ссылочные - в куче
        1.3 ститические переменные принадлежат классу, а не экземпляру класса

        2.2 Переменная number не инициализирована
        2.3 int number = 5;
        2.4 Число не положительное


        4. С
        оператор ++i - префиксный, сначала он производит операцию, а потом уже выдает результат
                    i++ - постфиксный, сначала выдает результат, а уже потом производит операцию



         */

        // 6.

/*        for (int i = 1; i <= 9; i++) {
            if (i % 2 != 0){
                System.out.println(i);
            }
        }*/


//        int day = 1; // 1 - 7
//
//        ifElse(day);
//
//        mySwitch(day);

//        // false = 0; true = 1;
//        int a = 5;
//        int b = 3;
////        boolean result = (a == b) && (a > b); // 0 && 1 -> false (0)
//        boolean result = !((a == b) || (a > b)); // 0 || 1 -> true (1)
//        /*
//         Лайфхак:
//         если у нас && (И) , то два значения перемножаем
//         если у нас || (ИЛИ), то два занчения складываем
//        * */
//        if(result){
//            System.out.println("true");
//        }else {
//            System.out.println("false");
//        }


        myWhile();

        Scanner scanner = new Scanner(System.in);
        int input;

        do {
            System.out.println("Введите число (для выхода введите 0):");
            input = scanner.nextInt();
            if (input != 0) {
                System.out.println("Вы ввели: " + input);
            }
        } while (input != 0);
        System.out.println("всем пока");
    }

    private static void myWhile() {
        Scanner scanner = new Scanner(System.in);
        int input = -1;
        while (input != 0) {

            System.out.println("Введите число (для выхода введите 0):");
            input = scanner.nextInt();
            if (input != 0) {
                System.out.println("Вы ввели: " + input);
            }
        }
        System.out.println("всем пока");
    }

    private static void mySwitch(int day) {
        switch (day) {
            case 1:
                System.out.println("пн");
                break;
            case 2:
                System.out.println("вт");
                break;
            case 3:
                System.out.println("ср");
                break;
            case 4:
                System.out.println("чт");
                break;
            case 5:
                System.out.println("пт");
                break;
            case 6:
                System.out.println("сб");
                break;
            case 7:
                System.out.println("вс");
                break;
            default:
                System.out.println("Некорректное значение");
        }
    }

    private static void ifElse(int day) {
        if (day == 1) {
            System.out.println("пн");
        } else if (day == 2) {
            System.out.println("вт");
        } else if (day == 3) {
            System.out.println("ср");
        } else if (day == 4) {
            System.out.println("чт");
        } else if (day == 5) {
            System.out.println("пт");
        } else if (day == 6) {
            System.out.println("сб");
        } else if (day == 7) {
            System.out.println("вс");
        } else {
            System.out.println("Некорректное значение");
        }
    }
}
