package work_09_04_2025.task_1;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle("Красный", 5.5);
        Shape rectangle = new Rectangle("Синий", 3.0, 5.2);

//        double circleArea = circle.getArea();
//        System.out.println(circleArea);
        System.out.println(circle.getArea());
        circle.printColor();

//        double rectangleArea = rectangle.getArea();
//        System.out.println(rectangleArea);
        System.out.println(rectangle.getArea());
        rectangle.printColor();

    }
}
