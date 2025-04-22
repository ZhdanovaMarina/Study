package work_14_03_2025.hw;

import java.util.Scanner;

public class PrimesAllInOne {
    public static void main(String[] args) {
        int number = scanNumber();
        printPrimeNumbers(number);

//        System.out.println(isPrime(32323293));
    }

    private static void printPrimeNumbers(int number) {
        for (int i = 2; i <= number; i++) {
            boolean result = isPrime(i);
            if (result) {
                System.out.print(i + " ");
            }
        }
    }

    private static int scanNumber() {
        // считываем число с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        scanner.close();

        return N;
    }

    private static boolean isPrime(long number) {
        boolean isPrime = true;
        for (int j = 2; j < number; j++) {
            if (number % j == 0) {
                isPrime = false;
                System.out.println("Число делится на " + j);
                break;
            }
        }
        return isPrime;
    }
}
