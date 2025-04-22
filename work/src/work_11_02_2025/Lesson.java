package work_11_02_2025;

import java.util.ArrayList;
import java.util.List;

public class Lesson {
    public static void main(String[] args) {
        array();
        myList();

        ifElse();

    }

    private static void ifElse() {
        //        if(условие){
//            тело if
//        }else {
//            тело else
//        }

//        if(условие){
//            тело if
//        }else if(условие 2){
//            тело 2
//        } else {
//            тело else
//        }

        int n = 6;
        if(n<4){
            System.out.println("n<4");
        }else if(n<10){
            System.out.println("n<10");
        }else if(n<7){
            System.out.println("n<7");
        }else{
            System.out.println(n>=10);
        }
    }

    private static void myList() {

        List<String> names = new ArrayList<>(); // []
        names.add("Вася");
        names.add("Петя");
        names.add("Аня");

        names.get(1);

        names.add(2, "Иван");
        System.out.println(names.size());


    }

    private static void array() {
        int[] numbers = new int[3]; // [0, 0, 0]
        numbers[0] = 2;
        numbers[1] = 5;
        numbers[2] = -12;

        int[] numbers2 = {2,5,12};

        System.out.println(numbers[2]);
        System.out.println(numbers.length);

        for(int i = 0; i < numbers.length; i++){ // i = i+1
            System.out.println(numbers[i]);
        }
        System.out.println("=========================");
        for(int number : numbers ){
            System.out.println(number);
        }

        System.out.println("=========================");
        System.out.println(numbers);
    }
}