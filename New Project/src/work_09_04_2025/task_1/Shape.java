package work_09_04_2025.task_1;

public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }
    public abstract double getArea();

    public void printColor(){
        System.out.println(" Цвет фигуры: " + color);
    }
}
