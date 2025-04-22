package work_09_04_2025.hw.task_3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Playable> playables = new ArrayList<>();

        playables.add(new Guitar());
        playables.add(new Piano());
        playables.add(new Guitar());

        for (Playable playable : playables){
            playable.play();
        }


    }

}
