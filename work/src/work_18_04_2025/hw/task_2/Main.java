package work_18_04_2025.hw.task_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        NotificationService notificationService = new NotificationService();

        notificationService.register(new SmsStrategy());
        notificationService.register(new EmailStrategy());
        notificationService.register(new PushStrategy());

        notificationService.notifyAllStrategies("Pavel", "Акция! 2 = 1!");


    }
}
