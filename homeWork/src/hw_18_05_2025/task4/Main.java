package hw_18_05_2025.task4;

public class Main {
    public static void main(String[] args) {

    int number = 3;
    grade(number);

    }

    public static void grade(int score){

        switch (score){
            case 0:
                System.out.println("Ваша оценка: A (отлично)");
                break;
            case 1:
                System.out.println("Ваша оценка: B (хорошо)");
                break;
            case 2:
                System.out.println("Ваша оценка: C (удовлетворительно)");
                break;
            case 3:
                System.out.println("Ваша оценка: D (плохо)");
                break;
            case 4:
                System.out.println("Ваша оценка: F (неудовлетворительно)");
            default:
                System.out.println("Введена неверная цифра!");
        }
    }
}
