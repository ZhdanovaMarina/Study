package work_09_04_2025.ex_abstract;

public abstract class Animal {

    protected String name;

    public Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public abstract void makeSound();

}
