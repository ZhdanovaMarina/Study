package hw_18_05_2025.task18;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            integerList.add(random.nextInt(50));
        }

        Collections.sort(integerList);
        System.out.println("Лист после сортировки: " + integerList);

        Iterator<Integer> iterator = integerList.iterator();

        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 != 0) {
                iterator.remove();
            }
        }

        System.out.println("Лист после удаления нечетных чисел: " + integerList);


    }
}
