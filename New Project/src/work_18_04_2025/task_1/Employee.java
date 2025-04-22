package work_18_04_2025.task_1;

public abstract class Employee {

    protected String name;
    protected double rate;

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public double calcSalary(int hours) {
        return hours * rate;
    }

}
