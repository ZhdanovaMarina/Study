package projects;

public class MonthData {
    private int[] days = new int[30]; // Массив для хранения данных

    public MonthData() {

    }

    public MonthData(int[] days) {
        this.days = days;
    }


    public int[] getDays() {
        return days;
    }

    public int sumSteps() { // Сумма шагов за месяц
        int sum = 0;
        for (int i = 0; i < days.length; i++) {
            sum += days[i];
        }
        return sum;
    }


    public int maxStep() { // Максимальное количество шагов
        int max = 0;
        for (int i = 0; i < days.length; i++) {
            if (i > max) {
                max = days[i];
            }
        }
        return max;
    }

    public double averageStep() {
        return (double) sumSteps() / days.length;
    }

    public int bestSeries(int goal) { // Лучшая серия
        int currentSeries = 0;
        int bestSeries = 0;
        for (int steps : days) {
            if (steps >= goal) {
                currentSeries++;
            } else {
                currentSeries = 0;
            }
            bestSeries = Math.max(bestSeries, currentSeries);
        }
        return bestSeries;
    }
}
