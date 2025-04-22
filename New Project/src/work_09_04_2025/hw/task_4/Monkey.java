package work_09_04_2025.hw.task_4;

public class Monkey extends ZooAnimal{

    private double height; // рост

    public Monkey(String name, int age, double height) {
        super(name, age);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void makeSound() {
        System.out.println("А ууу а");
    }
}
