package work_09_04_2025.hw.task_4;

import java.util.ArrayList;
import java.util.List;

public class Enclosure {
    private List<ZooAnimal> animals;
    private String enclosureName;



    public Enclosure(String enclosureName) {
        this.animals = new ArrayList<>();
        this.enclosureName = enclosureName;
    }

    public void addAnimal(ZooAnimal animal){
        animals.add(animal);
    }

    public void removeAnimal(ZooAnimal animal){
        animals.remove(animal);
    }

    public void makeAllAnimalSound(){
        for (ZooAnimal animal : animals){
            animal.makeSound();
        }
    }

    public void checkAnimals(){
        System.out.println("Вольер: " + enclosureName);
        for (ZooAnimal animal : animals){

            animal.info();
            System.out.println("================================");
        }
    }

    public List<ZooAnimal> getAnimals() {
        return animals;
    }
}
