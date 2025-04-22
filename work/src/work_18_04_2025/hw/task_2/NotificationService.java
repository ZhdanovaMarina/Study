package work_18_04_2025.hw.task_2;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    private final List<NotificationStrategy> strategies = new ArrayList<>();

    public void register(NotificationStrategy s){
        strategies.add(s);
    }

    public void notifyAllStrategies(String to, String text){
        for (int i = 0; i < strategies.size(); i++) {
            strategies.get(i).send(to, text);

        }
    }

}
