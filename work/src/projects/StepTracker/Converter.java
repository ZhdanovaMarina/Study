package projects.StepTracker;

public class Converter {

    public int convertToKm(int steps) { // Перевод шагов в километры
        return (steps * 75) / 100000;
    }

    public int convertToKilocalories(int steps) { // Перевод шагов в килокалории
        return (steps * 50) / 1000;
    }

}
