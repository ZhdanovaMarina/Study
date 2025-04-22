package projects;

import java.util.Scanner;

public class StepTracker {
    private final MonthData[] monthToData = new MonthData[12];
    private int goalByStepsPerDay = 10_000;

    public StepTracker() {
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    public void addNewNumberStepsPerDay(Scanner scanner) { // Ввод шагов за день

        System.out.println("Введите номер месяца (1-12): ");
        int month = scanner.nextInt();
        MonthData monthData = monthToData[month - 1];

        System.out.println("Введите число месяца (1-30): ");
        int day = scanner.nextInt();
        int[] days = monthData.getDays();

        System.out.println("Введите количество шагов (1-20000): ");
        int numberOfSteps = scanner.nextInt();

        days[day - 1] = numberOfSteps;
//        monthToData[month-1].getDays()[day-1] = numberOfSteps;

    }

    public void changeStepGoal(Scanner scanner) { // Ввод цели шагов
        System.out.println("Введите новую цель шагов: ");
        int newGoal = scanner.nextInt();
        if (newGoal > 0) {
            goalByStepsPerDay = newGoal;
        } else {
            System.out.println("Цель должна быть больше 0!");
        }
    }

    public void printStatistic(Scanner scanner) {
        System.out.println("Введите номер месяца (1-12): ");
        int month = scanner.nextInt();
        MonthData monthData = monthToData[month - 1];

        int sumSteps = monthData.sumSteps();
        int maxStep = monthData.maxStep();
        double averageStep = monthData.averageStep();
        int bestSeries = monthData.bestSeries(goalByStepsPerDay);

        Converter converter = new Converter();
        int dist = converter.convertToKm(sumSteps);
        int kal = converter.convertToKilocalories(sumSteps);

        System.out.println("Сумма шагов: " + sumSteps);
        System.out.println("Максимальные шаги: " + maxStep);
        System.out.println("Среднее количество шагов: " + averageStep);
        System.out.println("Лучшая серия шагов: " + bestSeries);
        System.out.println("Дистанция: " + dist);
        System.out.println("Калории: " + kal);
    }
}
