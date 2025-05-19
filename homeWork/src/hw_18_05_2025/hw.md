### Темы для изучения


Основы синтаксиса Java – [Metanit: Введение в Java](https://metanit.com/java/tutorial/1.1.php)

Типы данных и переменные – [Metanit: Типы данных](https://metanit.com/java/tutorial/2.1.php)

Операторы и выражения – [Metanit: Операторы и выражения](https://metanit.com/java/tutorial/2.2.php)

Условные конструкции (if/else, switch) – [Metanit: if/else](https://metanit.com/java/tutorial/2.5.php)

Циклы (for, while) – [Metanit: Циклы](https://metanit.com/java/tutorial/2.3.php)

Метод main (точка входа программы) – [Metanit: Основы Java](https://metanit.com/java/tutorial/1.1.php)

Классы и объекты – [Sky.pro: Классы в Java]()

Поля и методы класса – [Sky.pro: Поля и методы]()

Конструкторы – [Metanit: Конструкторы в Java]()

Модификаторы доступа – [Metanit: Модификаторы доступа]()

Инкапсуляция – [Sky.pro: Инкапсуляция в Java](https://sky.pro/media/chto-takoe-inkapsulyacziya-v-java/)

Наследование классов – [Sky.pro: Наследование в Java](https://sky.pro/wiki/java/nasledovanie-v-java/)

Полиморфизм – [Sky.pro: Полиморфизм в Java](https://sky.pro/wiki/java/polimorfizm-v-java/)

Ключевые слова this и super – [Metanit: Ключевые слова this и super]()

Перегрузка и переопределение методов – [Sky.pro: Методы в Java](https://sky.pro/wiki/java/metody/)

Класс Object и метод toString() – [Metanit: Переопределение toString()](https://metanit.com/java/tutorial/2.10.php)

Перечисления (enum) – [Habr: Перечисления в Java](https://habr.com/ru/companies/otus/articles/814787/)

Коллекции Java (Collections Framework) – [Metanit: Коллекции](https://metanit.com/java/tutorial/3.1.php)

Список (List) и класс ArrayList – [SkillFactory: ArrayList](https://blog.skillfactory.ru/glossary/arraylist/)

Отображение (Map) и класс HashMap – [SkillFactory: HashMap](https://blog.skillfactory.ru/glossary/hashmap/)

Обобщения (Generics) – [Metanit: Generics](https://metanit.com/java/tutorial/3.2.php)

Итерация по коллекциям – [Metanit: Итерация по коллекциям](https://metanit.com/java/tutorial/3.3.php)

Статические поля и методы – [Metanit: Статические члены](https://metanit.com/java/tutorial/2.12.php)

Ключевое слово final – [Metanit: final](https://metanit.com/java/tutorial/2.13.php)

Композиция объектов – [Metanit: Композиция и агрегация]()

Интерфейсы – [Sky.pro: Интерфейсы в Java]()

Абстрактные классы – [Sky.pro: Абстрактные классы]()

Обработка исключений – [Metanit: Исключения в Java]()

Организация кода (пакеты и import) – [Metanit: Пакеты в Java]()

Юнит-тестирование (JUnit) – [JavaRush: Юнит-тестирование на Java]()


##  Мини‑задачи к блоку «Основы Java» (этап 1)

| № | Тема | Сформулированное задание | 
| --- | --- | --- | 
| 1 | Основы синтаксиса / main | Создайте проект, в main напечатайте строку Hello, Java <версия JVM>! — версию возьмите из System.getProperty("java.version"). | 
| 2 | Типы данных и переменные | Объявите переменные всех примитивных типов и выведите их максимальные/минимальные значения (исп. Integer.MAX_VALUE). | 
| 3 | Операторы | Напишите метод, переводящий градусы °C в °F и К. Проверьте на 0 °C и 100 °C. | 
| 4 | if / switch | Метод grade(int score) возвращает A…F по 5‑балльной шкале. Реализуйте на switch, а диапазоны опишите в javadoc. | 
| 5 | Циклы | Вычислите факториал числа, используя for, и сумму цифр числа, используя while. | 
| 6 | Классы и объекты | Создайте класс Rectangle с полями width, height, методами area() и perimeter(). | 
| 7 | Поля/методы | В Rectangle добавьте счётчик созданных экземпляров (static int counter). | 
| 8 | Конструкторы | Перегрузите конструкторы: без аргументов (1×1) и с двумя аргументами. | 
| 9 | Модификаторы доступа | Сделайте поля private, добавьте getWidth/Height и setWidth/Height с проверкой, что значение > 0. | 
| 10 | Инкапсуляция | Перепроверьте, что прямой доступ к полям запрещён; исправьте, если нет. | 
| 11 | Наследование | Наследуйте Square от Rectangle, конструктор принимает только side. | 
| 12 | Полиморфизм | Сформируйте List<Rectangle> из 3 Rectangle и 2 Square, вызовите area() у всех. | 
| 13 | this / super | В конструкторе Square вызовите конструктор суперкласса через super. | 
| 14 | Перегрузка / переопределение | Перегрузите setWidth(double) в Square, чтобы одновременно менять и ширину, и высоту. | 
| 15 | toString() | Переопределите toString() у обоих классов, чтобы вывод был Rectangle(3×4) / Square(5). | 
| 16 | enum | Создайте enum Day, метод isWeekend(). В main перечислите все дни и распечатайте, выходной ли он. | 
| 17 | Коллекции (общ.) | Сгенерируйте 20 случайных чисел в List<Integer>, отсортируйте, выведите. | 
| 18 | ArrayList | Удалите из списка все нечётные числа (итерация индексов vs Iterator). | 
| 19 | HashMap | Создайте Map<String,Integer>: имя продукта → кол‑во. Выведите все записи формата яблоки – 5 шт. | 
| 20 | Generics | Напишите класс‑обёртку Box<T> с одним полем value, геттером и toString(). | 
| 21 | Итерация | Выведите Map из п.19 тремя способами: по ключам, по значениям, по entrySet. | 
| 22 | static | Сделайте утилитарный класс MathUtils с static gcd(int a,int b) — алгоритм Евклида. | 
| 23 | final | Сделайте final class Constants с public static final double PI = 3.1415…. | 
| 24 | Композиция | Класс Person содержит поле‑объект Address. Создайте экземпляр и выведите его toString(). | 
| 25 | Интерфейсы | Опишите интерфейс Movable с move(int dx,int dy). Реализуйте его в Rectangle. | 
| 26 | Абстрактные классы | Абстрактный Figure c методом area(). Rectangle и Circle от него. | 
| 27 | Исключения | Метод divide(int a,int b) бросает собственное DivisionByZeroException, если b==0. | 
| 28 | Пакеты / import | Разнесите figure, util, exceptions по пакетам; наведите порядок в import. | 
| 29 | JUnit (база) | Тест‑кейс RectangleTest.area() проверяет, что new Rectangle(3,4).area()==12. Используйте JUnit 5. | 



---

