package hw_18_05_2025.task3;

public class Main {

    public static void main(String[] args) {

        fromCelsiusToFahrenheit(25);
        System.out.println();
        fromCelsiusToKelvin(25);

    }

    public static void fromCelsiusToFahrenheit(int celsius){
        int fahrenheit = (((celsius * 9) / 5) + 32);
        System.out.printf("Перевод %s градусов Цельсия в градусы Фаренгейта. Итог: %s ", celsius, fahrenheit);
    }

    public static void fromCelsiusToKelvin(int celsius){
        int kelvin = celsius + 273;
        System.out.printf("Перевод %s градусов Цельсия в градусы Кельвина. Итог: %s ", celsius, kelvin);
    }
}
