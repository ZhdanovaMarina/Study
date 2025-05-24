package hw_18_05_2025.task5;

public class Main {
    public static void main(String[] args) {

        factorial(5);


    }

    public static void factorial(int number){
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.printf("Факториал числа %s равен : %s", number, factorial);
    }


}
