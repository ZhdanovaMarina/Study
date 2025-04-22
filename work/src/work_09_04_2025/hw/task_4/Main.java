package work_09_04_2025.hw.task_4;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();


        Enclosure lionEnclosure = new Enclosure("львы");
        lionEnclosure.addAnimal(new Lion("Алекс", 20));
        lionEnclosure.addAnimal(new Lion("Сын Алекса", 1));

        zoo.addEnclosures(lionEnclosure);

        Enclosure elephantEnclosure = new Enclosure("слоны");
        elephantEnclosure.addAnimal(new Elephant("Глория", 4, 40));

        zoo.addEnclosures(elephantEnclosure);

        Enclosure monkeyEnclosure = new Enclosure("макаки");
        monkeyEnclosure.addAnimal(new Monkey("Джулиана", 15, 96.0));
        monkeyEnclosure.addAnimal(new Monkey("Джулиан", 10, 960.0));

        zoo.addEnclosures(monkeyEnclosure);

        zoo.checkAnimals();















    }
}
