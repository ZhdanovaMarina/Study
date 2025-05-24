package hw_18_05_2025.task6;

public class Square extends Rectangle{

    private double side;

    public Square(double side) {
        super();
        this.side = side;
    }

    @Override
    public void area() {
        double area = side * side;
        System.out.println("Площадь  квадрата равна: " + area);
    }

    public void setWidth(double width){

    }

    @Override
    public String toString() {
        return "Square " + "(" + side + ")";
    }
}
