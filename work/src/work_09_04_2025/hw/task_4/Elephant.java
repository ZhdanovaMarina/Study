package work_09_04_2025.hw.task_4;

public class Elephant extends ZooAnimal{

    private int trunkLength; // длина хобота

    public Elephant(String name, int age, int trunkLength) {
        super(name, age);
        this.trunkLength = trunkLength;
    }

    public int getTrunkLength() {
        return trunkLength;
    }

    public void setTrunkLength(int trunkLength) {
        this.trunkLength = trunkLength;
    }

    @Override
    public void makeSound() {
        System.out.println("Труууу");
    }
}
