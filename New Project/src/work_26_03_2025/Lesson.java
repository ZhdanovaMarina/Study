package work_26_03_2025;

import java.util.Stack;

public class Lesson {

    public static void main(String[] args) {
//        defaultStack();
        MyStack numbers = new MyStack(3);

        numbers.push(11);
        numbers.push(22);
        numbers.push(33);

         numbers.print();

        System.out.println("Верхний элемент: " + numbers.peek());

        System.out.println("Извлекаем элемент: " + numbers.pop());
        numbers.print();

        System.out.println("Пустой стек? " + numbers.isEmpty());
    }

    private static void defaultStack() {
        Stack<String> names = new Stack<>();

        names.push("Ann");
        names.push("Vasay");
        names.push("Petr");

        System.out.println("Текущий стек: " + names);

        System.out.println("Верхний элемент: " + names.peek());

        System.out.println("Извлекаем элемент: " + names.pop());
        System.out.println("Стек после извлечения: " + names);

        System.out.println("Пустой стек? " + names.isEmpty());
    }
}
