package work_07_03_2025.hw;

import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();

//      sum(s);
//      factorial(s);
        isPrime(s);

    }

    private static void factorial(int s) {
        int result = 1;
        for (int i = 1; i <= s; i++) {
            result *= i;
        }
        System.out.println(result);
    }

    private static void sum(int s) {
        int sum = 0;
        for (int i = 0; i <= s; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void isPrime(int x){
        int num = 2;
        for (int i = 2; i <= x ; i++) {
            if (i / i == 0){
                num = i;
            } else {

            }
            System.out.println(num);
        }

    }



}
