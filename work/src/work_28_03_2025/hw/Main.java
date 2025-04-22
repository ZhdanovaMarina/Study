package work_28_03_2025.hw;

public class Main {
    public static void main(String[] args) {

        // Лекция: Переменные и области видимости

//        VariableScopeExample name = new VariableScopeExample();
//        name.printName("Eva");

//        task_4();
//        task_6(); !!! ВОПРОС !!!
//        task_8      в классе VariableScopeExample
//        task_10     к локальной переменной нельзя обратиться за пределами блока кода,
//                    в котором она была объявлена
//        task_12();
//        task_14();  не пон
//        task_16();  не пон
//        task_16();  не пон


        Task6 task = new Task6();
        Task6 task1 = new Task6();
        Task6 task2 = new Task6();








    }

    private static void task_12() {
        int[] array = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i <array.length; i++) {
            int num = 0;
            num = num + i;
            System.out.println(num);
        }
//        num - недоступна
    }

    private static void task_4() {
        Person person1 = new Person("Eva", 25);
        Person person2 = new Person("Dima", 42);
        Person person3 = new Person("Vera", 30);


        System.out.println(person1.name + " " + person1.age);
        System.out.println(person2.name + " " + person2.age);
        System.out.println(person3.name + " " + person3.age);
    }


}
