package work_06_05_25;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Lesson {

    public static void main(String[] args) {

//        //  компаратора через анонимную реализацию
//        Comparator<String> byLengthDesc = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.compare(o2.length(), o1.length());
//            }
//        };
//
//        // через лямбду
//        Comparator<String> cmp = ((o1, o2) -> Integer.compare(o2.length(), o1.length())); // 1,2,3,4
//        cmp.reversed(); // 4,3,2,1


        List<String> words = List.of("Java", "C", "Python", "Go", "Ruby", "Rust", "Kotlin");
        System.out.println(topN(words,3));
    }


    public static List<String> topN(List<String> words, int n){
        List<String> copy = new ArrayList<>(words);
        Iterator<String> it = copy.iterator();
        while (it.hasNext()) {
            if (it.next().length() <= 3) {
                it.remove();
            }
        }

        Comparator<String> byLengthDesc = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o2.length(), o1.length());
            }
        };

        copy.sort(byLengthDesc);

        copy.sort(Comparator.comparingInt(String::length).reversed());


        if(copy.size() < n){
            return copy;
        }
        return new ArrayList<>(copy.subList(0,n));
    }
}
