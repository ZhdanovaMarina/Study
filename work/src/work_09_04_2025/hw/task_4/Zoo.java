package work_09_04_2025.hw.task_4;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    List<Enclosure> enclosures = new ArrayList<>();
    // herbivores хищники, predators травоядные, omnivores всеядные


    public void addEnclosures(Enclosure enclosure){
        enclosures.add(enclosure);
    }

    public void checkAnimals(){
        for (Enclosure enclosure : enclosures){
            enclosure.checkAnimals();
        }
    }





}
