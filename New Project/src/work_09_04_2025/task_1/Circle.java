package work_09_04_2025.task_1;

public class Circle extends Shape{

    private double radius;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * 2;
    }

}
