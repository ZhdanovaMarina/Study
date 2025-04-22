package work_13_02_2025;

public class Lesson {

    public static void main(String[] args) {
//        printSum(2,3);
//        sayHello();
//        sayHelloByName("Ann");
//        sayHelloByName("Vasya");
        int anyNumber = 10;
        int result = addBy10(anyNumber); // int result = 20;
        result = multiBy5(result);
        System.out.println(result);

        System.out.println(addBy10(multiBy5(divBy2(anyNumber))));
    }

    static int addBy10(int number) {
        return number + 10;
    }

    static int multiBy5(int number) {
        return number * 5;
    }

    static int divBy2(int number) {
        return number / 2;
    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }

    // cигнатура метода: [тип_данных] имяМетода([тип_параметра1],[тип_параметра2]...)
    static void sayHello() {
        System.out.println("Hello");
    }

    static void sayHelloByName(String name) {
        System.out.println("Hello " + name);
    }
}
