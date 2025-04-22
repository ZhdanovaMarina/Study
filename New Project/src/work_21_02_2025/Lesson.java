package work_21_02_2025;

public class Lesson {
    public int age = 30;

    public static void main(String[] args) {
        /*
        1) Локальные переменные
        2) Переменные экземпляра
        3) Статические
        4) Переменные блочной области видимости (for, if, switch)
        * */


        Person ann = new Person();
//        ann.name = "Ann";
        ann.setName("Ann");
        ann.age = 18;
        printAge(ann);
        System.out.println(Person.uni);
    }


    public static void printAge(){
        int age = 25;
        System.out.println(age);

        if(5>3){
            int myResult = 6;
            System.out.println(myResult);
        }
        if(50>3){
            int myResult = 6;
            System.out.println(myResult);
        }

    }
    public static void printAge(Person person){
        int age = 25;
        System.out.println(person.age);
    }

}
