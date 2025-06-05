package hw_18_05_2025.task5;

public class Main {
    public static void main(String[] args) {

        factorialUsingFor(5);
        factorialUsingWhile(5);


    }

    public static void factorialUsingFor(int number){
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.printf("Факториал числа %s равен : %s", number, factorial);
    }

    public static void factorialUsingWhile(int number){

        int factorial = 1;
        int count = 1;

        while (count <= number){
            factorial *= count;
            count++;
        }
        System.out.printf("\nФакториал числа %s равен : %s", number, factorial);
    }


}
