package hw_18_05_2025.task9;

public class Rectangle {
    private static int counter;
    protected double width;
    protected double height;

    public Rectangle(double width){
        this.width = width;
    }
    public Rectangle(){

    }
    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Значение не может быть меньше нуля!");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Значение не может быть меньше нуля!");
        }
    }


    public void area(){

    }

    public void perimeter(){

    }


}
