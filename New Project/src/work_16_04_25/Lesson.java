package work_16_04_25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lesson {
    public static void main(String[] args) {
//        array();

        /*
        Базовые методы коллекций:
        add - добавление
        remove - удаление
        contains - проверка содержит ли
        size - вернет текущий размер
        iterator - исп. для обхода элементов коллекций(ипс. при изменении)

        Характеристики листа:
        (сохраняется порядок, допускаются дубликаты, осуществляется доступ по индексу)

        Методы листа:
        get - получение элемента по индексу
        set - заменить элемент указанной позиции
        add - содержит 2 параметра, вставляет элем. между другими позициями
        indexOf/lastIndexOf - находят индекс входнения первого/последнего элемента
        listIterator - позволяет итерироваться вперед и назад

         */
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(5);

        numbers.add(1,10);
        System.out.println(numbers);

        Collections.sort(numbers);

        System.out.println(numbers);


    }

    private static void array() {
        int[] numbers = new int[3]; // [0,0,0]
        String[] names = new String[2]; // [null, null]
        System.out.println(numbers[0]); // O(1)
//      [1,2,3] -> [1,2,0]
    }
}
