package work_07_03_2025;

import java.util.ArrayList;
import java.util.List;

public class Lesson {

    public static void main(String[] args) {

        test();

        // Списки
        List<Integer> numbers = new ArrayList<>(); // []
        //добавление
        numbers.add(10);
        numbers.add(100);
        numbers.add(105);
        // провекра элемента на нахождение в списке
        System.out.println(numbers.contains(100)); // true
        System.out.println(numbers.indexOf(105)); // 2
        System.out.println(numbers.indexOf(11)); // -1

        // удаление
        numbers.remove(Integer.valueOf(10));
        System.out.println(numbers);

        // array[0] -> list.get(0)


        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            num.add(1);
        }
        System.out.println(num);


        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("01.02.2025", 1000));
        transactions.add(new Transaction("02.02.2025", 2000));
        transactions.add(new Transaction("03.02.2025", 3000));

        for (int i = 0; i < transactions.size(); i++) {
            System.out.println("Транзакция № " + (i + 1));
            System.out.println("Дата " + transactions.get(i).getDate());
            System.out.println("Сумма " + transactions.get(i).getSum());
            System.out.println();
        }

    }

    private static void test() {
        Cat cat = new Cat();
        Person person = new Person(20, "Kolya");
        person.getName();
        person.printInfo();
    }


    public static void arrayExample(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int result = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 4 == 0) {
                result += numbers[i]; // result = result + numbers[i]
            }
        }
        System.out.println(result);
    }


}
