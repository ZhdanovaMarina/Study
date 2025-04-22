package work_28_03_2025.hw;

public class VariableScopeExample {
    String name = "Pavel";


    public void printName(String name){
        System.out.println("Локальная переменная name: " + name);
        System.out.println("Экземплярная переменная name: " + this.name);
    }

// task_2
    public void printInt(){
        int count = 5;
        System.out.println(count);
    }

}
