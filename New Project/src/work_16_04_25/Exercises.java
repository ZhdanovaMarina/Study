package work_16_04_25;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercises {
    public static void main(String[] args) {

        List<Integer> numder = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            numder.add(random.nextInt(100)); // 0..99
        }
        System.out.println(numder);



    }

    public static void addTransactions(){
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(5000, "Поступление", "01.02.25"));
        transactions.add(new Transaction(2000, "Оплата", "10.02.25"));
        transactions.add(new Transaction(1000, "Поступление", "01.02.25"));
        transactions.add(new Transaction(500, "Оплата", "10.02.25"));

    }

    /*

    1) Создать класс Transaction
    2) Создать список transactions, добавить несколько транзакций (3–4 штуки).
    3) Вывести список всех транзакций, а затем подсчитать суммарный доход и суммарный расход.

     */
}
