package hw_18_05_2025.task16;

public class Main {
    public static void main(String[] args) {

        isWeekend(Day.MONDAY);
        isWeekend(Day.TUESDAY);
        isWeekend(Day.WEDNESDAY);
        isWeekend(Day.THURSDAY);
        isWeekend(Day.FRIDAY);
        isWeekend(Day.SATURDAY);
        isWeekend(Day.SUNDAY);

    }

    public static void isWeekend(Day day) {

        switch (day) {
            case MONDAY:
                System.out.println("Сегодня понедельник! Рабочий день!");
                break;
            case TUESDAY:
                System.out.println("Сегодня вторник! Рабочий день!");
                break;
            case WEDNESDAY:
                System.out.println("Сегодня среда! Рабочий день!");
                break;
            case THURSDAY:
                System.out.println("Сегодня четверг! Рабочий день!");
                break;
            case FRIDAY:
                System.out.println("Сегодня пятница! Рабочий день!");
                break;
            case SATURDAY:
                System.out.println("Сегодня суббота! Выходной день!");
                break;
            case SUNDAY:
                System.out.println("Сегодня воскресенье! Выходной день!");
                break;
            default:
                System.out.println("Такого дня недели не существует!");
                break;
        }
    }
}
