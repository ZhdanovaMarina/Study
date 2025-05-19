package work_18_05_25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson {

    public static void main(String[] args) {
        Map<Integer, List<String>> namesMap = new HashMap<>();

        List<String> names1990 = new ArrayList<>();
        names1990.add("Петя");
        names1990.add("Аня");
        names1990.add("Вася");

        namesMap.put(1990, names1990);
        if(namesMap.containsKey(1990)){
            namesMap.get(1990);
        }
    }
}
