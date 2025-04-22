package work_21_02_2025;

public class Person {

    static String uni = "MSU";

    private String name; // null

    int age; // 0

    public void sayHello(){
        System.out.println("Привет, меня зовут " + name);
    }

    public void setName(String name){
        this.name = name;
    }

}
