package work_09_04_2025.hw.task_4;

public class Lion extends ZooAnimal{


    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Ppp ppp");
    }
}
