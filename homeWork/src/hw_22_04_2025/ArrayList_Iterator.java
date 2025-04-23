package hw_22_04_2025;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Iterator {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Паша");
        list.add("Оля");
        list.add("Ксюша");
        list.add("Ира");

        System.out.println(list);

        List<String> resultList = topN(list, 3);
        System.out.println(resultList.toString());



/**        // 1. Создаём список
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);                // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        }

        // 2. Берём обычный Iterator
        Iterator<Integer> it = numbers.iterator();

        // 3. Итерируемся и удаляем нечётные числа
        while (it.hasNext()) {
            int n = it.next();             // получаем элемент
            if (n % 2 != 0) {              // условие удаления
                it.remove();               // ⚠️ именно remove() у Iterator!
            }
        }

        // 4. Проверяем результат
        System.out.println(numbers);       // [2, 4, 6, 8, 10]
*/


    }

    public static List<String> topN(List<String> words, int n) {

        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()){
            if (iterator.next().length() <=3 ) {
                iterator.remove();
            }
        }

        return words;
    }


}
