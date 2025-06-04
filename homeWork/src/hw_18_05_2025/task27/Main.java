package hw_18_05_2025.task27;

import hw_18_05_2025.task23.Constants;

public class Main {
    public static void main(String[] args) {

        try {
           int result =  divide(10, 0);
            System.out.println(result);
        } catch (Exception e){
           throw new DivisionByZeroException("Ошибка в методе divide");
        }

    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
