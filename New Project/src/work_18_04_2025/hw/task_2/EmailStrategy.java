package work_18_04_2025.hw.task_2;

public class EmailStrategy implements NotificationStrategy {
    @Override
    public void send(String to, String text) {
        System.out.println("Отправлено на почту " + to + " , " + "текст сообщения: " + text);
    }
}
