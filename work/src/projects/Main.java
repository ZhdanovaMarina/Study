package projects;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();

        while (true) {
            printMenu();
            System.out.println("Введите команду: ");
            int command = scanner.nextInt();

            if (command == 1) {
                stepTracker.addNewNumberStepsPerDay(scanner);
            } else if (command == 2) {
                stepTracker.changeStepGoal(scanner);
            } else if (command == 3) {
                stepTracker.printStatistic(scanner);
            } else if (command == 4) {
                System.out.println("Программа завершена! До встречи");
                break;
            } else {
                System.out.println("Введена некорректная цифра");
            }
        }

        scanner.close();


    }

    public static void printMenu() {
        System.out.println("1.Ввести шаги за день: ");
        System.out.println("2.Изменить цель шагов: ");
        System.out.println("3.Вывести статистику за месяц: ");
        System.out.println("4.Выйти");
    }

}
