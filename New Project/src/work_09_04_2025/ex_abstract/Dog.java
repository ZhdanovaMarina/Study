package work_09_04_2025.ex_abstract;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " say woof");
    }

}
