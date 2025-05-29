package hw_18_05_2025.task21;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> fruits = new HashMap<>();

        fruits.put("Красные яблоки", 10);
        fruits.put("Апельсины", 5);
        fruits.put("Арбузы", 2);


        if (fruits.containsKey("Красные яблоки")) {
            fruits.get("Красные яблоки");
        }

        for (String key : fruits.keySet()) {
            System.out.println("Вывод по ключу: " + key + " " + fruits.get(key));
        }

//        for (Integer value : fruits.values()){
//            System.out.println("Вывод по значению: " + value + " " + fruits.get(value));
//        }



    }
}
