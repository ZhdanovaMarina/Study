package work_18_04_2025.hw.task_2;

public class Main {

    public static void main(String[] args) {

        NotificationService notificationService = new NotificationService();

        notificationService.register(new SmsStrategy().send("+72228886611", "АКЦИЯ! 2 по цене 1"));
        notificationService.register(new EmailStrategy().send("amamam@mail.ru", "АКЦИЯ! 2 по цене 1"));
        notificationService.register(new PushStrategy().send("Пупупу", "АКЦИЯ! 2 по цене 1"));

        notificationService.notifyAll();
    }
}
