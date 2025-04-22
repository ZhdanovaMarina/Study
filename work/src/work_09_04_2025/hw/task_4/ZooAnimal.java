package work_09_04_2025.hw.task_4;

public abstract class ZooAnimal {

    protected String name;
    protected int age;

    public String getName() {
        return name;
    }

    public ZooAnimal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();

    public void info(){
        System.out.println("Мое имя " + name);
        System.out.println("Мой возраст " + age);
    }

}
