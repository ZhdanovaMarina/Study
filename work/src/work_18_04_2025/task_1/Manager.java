package work_18_04_2025.task_1;

public class Manager extends Employee {


    public Manager(String name, int rate) {
        super(name, rate);
    }

    @Override
    public double calcSalary(int hours) {
        return super.calcSalary(hours) * 1.1;
    }
}

