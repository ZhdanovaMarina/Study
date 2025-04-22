package work_07_03_2025;

public class Person {

    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void printInfo(){
        System.out.println("Возраст: " + age);
        System.out.println("Имя: " + name);
    }
}
