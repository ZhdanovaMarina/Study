package work_14_03_2025;

import java.util.Scanner;

public class WorkTask {

    public static void main(String[] args) {

        String word = cleanedWord();


    }

    private static String cleanedWord() {
        // считываем строку
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        // преобразование строки
        String cleaned = input.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase(); // регулярное выражения

        // остановка сканера
        scanner.close();

        return cleaned;
    }

    private static void calculatePalindrome(String cleaned) {
        //вычисление, является ли строка палиндромом
        // если левая строка меньше правой, то сравниваются символы по индексу, и если они не равны, то
        // это не палиндром,
        boolean isPalindrome = true;
        int left = 0;
        int right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
    }


    private static void printResult(boolean isPalindrome){
        // выводим на экран результат
        if (isPalindrome) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
    }
}
