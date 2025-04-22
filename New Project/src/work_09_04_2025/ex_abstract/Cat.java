package work_09_04_2025.ex_abstract;

public class Cat extends Animal{

    public Cat(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " say meow");
    }

}
