package work_09_04_2025.task_1;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return  length * width;
    }
}
