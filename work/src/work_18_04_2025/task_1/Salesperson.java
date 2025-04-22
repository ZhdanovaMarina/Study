package work_18_04_2025.task_1;

public class Salesperson extends Employee{

    private double sales;


    public Salesperson(String name, int rate) {
        super(name, rate);
    }

    public void setSales(double sales){
        this.sales = sales;
    }
    @Override
    public double calcSalary(int hours) {
        return super.calcSalary(hours) + sales*0.05;
    }

}
