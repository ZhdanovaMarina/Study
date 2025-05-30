package hw_18_05_2025.task19;

import java.util.Collection;
import java.util.Collections;
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

        System.out.println("========================");
        for (Map.Entry<String, Integer> entry : fruits.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


        System.out.println("========================");
        for(Integer value:fruits.values()){
            System.out.println(value);
        }

        System.out.println("========================");
        for(String key:fruits.keySet()){
            System.out.println(key);
        }

    }
}
