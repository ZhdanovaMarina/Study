### задача 1 (Расчёт зарплаты)
Фокус: наследование + полиморфизм

Условие
Смоделируйте систему расчёта зарплаты.

1) Создайте базовый класс Employee с полями name, rate (часовая ставка) и методом 
double calcSalary(int hours).

2) Наследники:

- Manager — получает 10 % бонуса сверху;

- Salesperson — получает процент от продаж: поле double sales, метод setSales.

3) В main сформируйте List<Employee> из разных типов сотрудников и посчитайте 
ежемесячный фонд оплаты, вызвав calcSalary полиморфно.


### задача 2 Система уведомлений
Фокус: паттерн Стратегия + список стратегий

Условие
Реализуйте сервис отправки уведомлений клиенту разными каналами.

1) Интерфейс NotificationStrategy с методом send(String to, String text).

2) Стратегии‑реализации: EmailStrategy, SmsStrategy, PushStrategy.

3) Класс NotificationService, в котором хранится private final List<NotificationStrategy> strategies.

    Методы:

- register(NotificationStrategy s) – добавить стратегию;

- notifyAll(String to, String text) – пройти по списку и отправить сообщение всеми зарегистрированными каналами.

4) В main зарегистрируйте 2–3 стратегии и протестируйте.

### задача 3 Undo/Redo для текстового редактора

Фокус: паттерн Command + списки как стеки команд

Условие
Нужно реализовать историю действий над документом:

1) Интерфейс Command с методами execute() и undo().

2) Команды:

 - InsertText(int pos, String text) — вставка;

 - DeleteText(int pos, int len) — удаление.

3) Класс Editor хранит StringBuilder content.

4) Класс CommandHistory c двумя списками‑стеками:

 - List<Command> undoStack, List<Command> redoStack.

 - Методы: execute(Command c), undo(), redo().

5) Покажите сценарий: вставка, удаление, два undo, redo.