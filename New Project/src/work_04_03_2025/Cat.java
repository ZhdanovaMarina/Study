package work_04_03_2025;

public class Cat {

    static String ownerName;

    // Состояния\атрибуты класса
    int age;
    String name;

    // Конструктор
    public Cat(){
    }

    public Cat(int newAge, String newName){
        age = newAge;
        name = newName;
    }


    // действие
    public void eat(){
        System.out.println("Я ем. Очень вкусно");
    }

    public static void statMethod(){
        System.out.println("Я статический метод");
    }

}
