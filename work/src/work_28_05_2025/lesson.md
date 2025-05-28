#### Сценарий

Компания управляет флотом **доставочных дронов**, которые привозят посылки в разные зоны города. Когда дрон прилетает, в системе фиксируется его уникальный **серийный номер** (строка из восьми символов, например `D1A2B3C4`). Система распределяет дроны по посадочным площадкам, следит за временем стоянки, взимает административный сбор, а также печатает купоны на бесплатную замену аккумулятора.

---

### 13\. Класс `LandingPad` и класс `Drone`

Ниже приведён фрагмент кода.

```java
public class LandingPad {
    private Drone[] drones;
    private String zoneName;

    public LandingPad(String zoneName, int capacity) {
        this.zoneName = zoneName;
        if (capacity > 200) capacity = 200;
        drones = new Drone[capacity];
    }

    public String getZoneName() { return zoneName; }

    public int getCapacity() { return drones.length; }

    public int findDrone(String serial) {
        //TODO: вернуть индекс дрона с заданным серийным номером
        return -1;
    }
}
```

```java
public class Drone {
    private String serial;
    private boolean needsService;
    private byte colour;

    public final static byte BLACK = 1;
    public final static byte WHITE = 2;
    public final static byte RED   = 3;
    private final static double ADMIN_FEE = 4.5;

    public Drone(String serial) { this.serial = serial; }
    public Drone(String serial, byte colour) {
        this.serial = serial; this.colour = colour;
    }

    public void setNeedsService(boolean flag) { needsService = flag; }
    public boolean getNeedsService() { return needsService; }
    public String  getSerial()       { return serial; }

    public double pay(int minutes) {
        //TODO: вернуть административный сбор, если стоянка ≤ 60 мин
        return 0.0;
    }
}
```

##### (a)

Укажите **одно** последствие использования модификатора `static` при объявлении констант `BLACK`, `WHITE`, `RED`.  \[2\]

##### (b)

Опишите взаимоотношение между классами `LandingPad` и `Drone`.  \[3\]

##### (c)

Объясните, почему в методе `setNeedsService` необходимо употреблять ключевое слово `this`.  \[2\]

##### (d)

(i) Напишите код, создающий объект класса `Drone` с серийным номером `D8F9E0A1`.  \[2\]  
(ii) С помощью метода‑селектора установите цвет созданного объекта как *красный*.  \[2\]

---

### 14\. Добавление дрона в первое свободное место

##### (a)

Сконструируйте метод `addDrone(Drone d)`, который добавит дрон в первый свободный элемент массива `drones[]`, вернёт его индекс или `‑1`, если места нет.  \[6\]

##### (b)

Назовите **два** отличия **наследования** от **агрегации**.  \[4\]

Два подкласса, `HeavyDrone` и `LightDrone`, расширяют `Drone`.

```java
public class HeavyDrone extends Drone {
    public static double minuteFee = 0.12;
    public double pay(int minutes) {
        //TODO: вернуть полную стоимость
    }
}
```

```java
public class LightDrone extends Drone {
    public static double minuteFee = 0.07;
    public double pay(int minutes) {
        //TODO: вернуть полную стоимость
    }
}
```

##### (c)

Создайте **UML‑диаграмму**, демонстрирующую отношения `LandingPad`, `Drone`, `HeavyDrone`, `LightDrone`. Атрибуты и методы расписывать не нужно.  \[4\]

##### (d)

(i) Реализуйте метод `pay` в классе `Drone`: если дрон стоял ≤ 60 минут, возвращается `ADMIN_FEE`, иначе `0`.  \[2\]  
(ii) Реализуйте метод `pay` в классе `HeavyDrone`, который использует `super.pay()` и добавляет плату за каждую минуту стоянки.  \[2\]

##### (e)

Объясните, почему тип `Drone` является корректным для массива `drones[]`, содержащего объекты `HeavyDrone` и `LightDrone`.  \[2\]

---

### 15\. Купоны на замену аккумулятора

Руководство решило: **каждому 40‑му тяжёлому** и **каждому 70‑му лёгкому** дрону выдаётся купон.  
Код печати купона реализован в статическом методе `Coupons.printBatteryVoucher()`.

##### (a)

Без кода опишите, что нужно изменить в методе `addDrone` и в классе `LandingPad`, чтобы схема работала.  \[5\]

##### (b)

Предложите **три** дополнительных теста, чтобы убедиться, что схема купонов работает.  \[3\]

Метод `removeDrone` внутри `LandingPad` ищет дрон по серийному номеру, удаляет его (ставит `null`) и возвращает ссылку или `null`.

##### (c)

Напишите метод `removeDrone`.  \[6\]

---

### 16\. Карта посадочных площадок

Одну стандартную площадку можно разделить на две для лёгких дронов. Программист решил использовать **двумерный массив**:

```java
Drone pads[][] = new Drone[2][150];
```

##### (a)

(i) Укажите **одно** преимущество такого массива.  \[1\]  
(ii) Укажите **один** недостаток.  \[1\]

Полиция просит быстро искать дрон по серийному номеру; предлагается **бинарное дерево поиска (BST)**.

##### (b)

Объясните, почему поиск в BST быстрее, чем линейный просмотр двумерного массива.  \[3\]

##### (c)

Перечислите шаги переноса данных из массива в BST.  \[5\]

---

### 17\. Узкий ангар и стек

В узком ангаре дроны ставятся в одну линию (стек). Чтобы достать первый поставленный дрон, все последующие приходится убирать и возвращать назад.

Класс `DroneStack` реализует методы  
`isEmpty()`, `push(Drone d)`, `pop()`.

```java
public static void staffRetrieveDrone(DroneStack stack, String serial){
    DroneStack temp = new DroneStack();
    // TODO
}
```

##### (a)

Составьте код метода `staffRetrieveDrone`, который достаёт дрон с нужным серийным номером и возвращает остальные на место.  \[6\]

##### (b)

Сравните использование **массива** и **односвязного списка** для реализации стека.  \[4\]

---

## Вариант 2

### Option D — Объектно‑ориентированное программирование

#### Сценарий

Больница разрабатывает систему для учёта **пациентов** на стационаре. Каждый пациент имеет **идентификатор** (строка длиной 8, например `P0A1B2C3`). Палаты располагаются в корпусах, и система распределяет пациентов по палатам, начисляет плату за койко‑день и выдаёт купоны на бесплатное обследование.

---

### 13\. Класс `Ward` и класс `Patient`

Фрагмент кода:

```java
public class Ward {
    private Patient[] beds;
    private String blockName;

    public Ward(String blockName, int capacity) {
        this.blockName = blockName;
        beds = new Patient[Math.min(capacity, 100)];
    }

    public int findPatient(String id){
        //TODO: линейный поиск пациента
        return -1;
    }
}
```

```java
public class Patient {
    private String id;
    private byte priority;   //1‑экстренный, 2‑плановый
    private int days;

    public final static byte EMERGENCY = 1;
    public final static byte PLANNED   = 2;
    private final static double DAILY_FEE = 2500;

    public Patient(String id){ this.id = id; }
    public Patient(String id, byte pr){ this.id = id; this.priority = pr; }

    public void addDay(){ days++; }
    public int  getDays(){ return days; }
    public String getId(){ return id; }

    public double bill(){
        //TODO: вернуть сумму к оплате
        return 0;
    }
}
```

##### (a)

Назовите **одну** причину, почему `DAILY_FEE` объявлена `static final`.  \[2\]

##### (b)

Опишите связь между `Ward` и `Patient`.  \[3\]

##### (c)

Почему в методе `bill` полезно использовать `this.days` вместо `days`?  \[2\]

##### (d)

(i) Создайте объект `Patient` с ID `P9Z8Y7X6`.  \[2\]  
(ii) Измените приоритет созданного пациента на экстренный.  \[2\]

---

### 14\. Метод `admit`

##### (a)

Реализуйте метод `admit(Patient p)`, помещающий пациента в первую свободную кровать массива `beds[]`; если места нет — вернуть `‑1`.  \[6\]

##### (b)

Укажите **два** различия между **композицией** и **наследованием**.  \[4\]

Созданы два подкласса:

```java
public class ChildPatient extends Patient {
    public static double dailySurcharge = 0.0;   //льготная категория
    public double bill(){
        //TODO
    }
}
```

```java
public class AdultPatient extends Patient {
    public static double dailySurcharge = 500;
    public double bill(){
        //TODO
    }
}
```

##### (c)

Набросайте **UML‑диаграмму** для `Ward`, `Patient`, `ChildPatient`, `AdultPatient`.  \[4\]

##### (d)

(i) Код метода `bill` в `Patient`: если дней ≤ 3, вернуть `0`; иначе `days * DAILY_FEE`.  \[2\]  
(ii) Метод `bill` в `AdultPatient` должен вызвать `super.bill()` и прибавить `dailySurcharge * days`.  \[2\]

##### (e)

Объясните, почему массив типа `Patient` может хранить объекты обоих подклассов.  \[2\]

---

### 15\. Купоны на обследование

Больница дарит **каждому 25‑му ребёнку** и **каждому 40‑му взрослому** пациенту купон на УЗИ; печатью управляет `CouponPrinter.printUZI()`.

##### (a)

Опишите необходимые изменения в `admit` и других классах, чтобы воплотить схему.  \[5\]

##### (b)

Предложите **три** дополнительных теста для проверки схемы.  \[3\]

Метод `discharge` в `Ward` ищет пациента, удаляет его, возвращая объект или `null`.

##### (c)

Напишите `discharge(String id)`.  \[6\]

---

### 16\. План корпуса

Каждую обычную палату можно разделить на две детские. Создан двумерный массив:

```java
Patient rooms[][] = new Patient[2][120];
```

##### (a)

(i) Назовите **одно** достоинство такой структуры.  \[1\]  
(ii) Назовите **один** недостаток.  \[1\]

Для быстрого поиска по ID предлагается **хеш‑таблица**.

##### (b)

Объясните, почему поиск по ключу в хеш‑таблице может быть быстрее, чем в двумерном массиве.  \[3\]

##### (c)

Опишите шаги переноса данных из массива `rooms` в хеш‑таблицу.  \[5\]

---

### 17\. Коридор‑бутылочное горлышко

При поступлении пациентов каталка устанавливается в узком коридоре (модель **очереди**). Нужно забрать первого поступившего; остальные временно вывозятся и возвращаются.

Класс `PatientQueue` имеет `isEmpty()`, `enqueue(Patient p)`, `dequeue()`.

```java
public static void staffFetchFirst(PatientQueue q){
    PatientQueue temp = new PatientQueue();
    //TODO
}
```

##### (a)

Напишите метод `staffFetchFirst`, который извлекает *первого* пациента и возвращает остальных.  \[6\]

##### (b)

Сравните реализацию очереди при помощи **циклического массива** и **двустороннего связного списка**.  \[4\]