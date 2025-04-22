package work_04_03_2025;

public class Lesson {

    public static void main(String[] args) {

//        exClass();

        /*
        модификаторы  доступа

        1) public - получить доступ из любого место приложения
        2) private - получить доступ может только сам класс
        3) protected - доступ внутри пакета и у наследников
        4) default - доступ внутри пакета
         */

        Student student = new Student("Ann");
        student.setAge(20);
        System.out.println(student.getName());
    }

    private static void exClass() {
        // объект - экземпляр класса
        Cat barsik = new Cat();
        barsik.age = 1;
        barsik.name = "Barsik";

        Cat sharik = new Cat(4,"Sharik" );

        System.out.println(barsik.name);
        System.out.println(sharik.name);

        barsik.eat();

        Cat.statMethod();
    }
}
