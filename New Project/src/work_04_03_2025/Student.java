package work_04_03_2025;

public class Student {

    private int age;
    private String name;


    public Student(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Say hi");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

}
