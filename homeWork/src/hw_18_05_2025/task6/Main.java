package hw_18_05_2025.task6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Rectangle> listFigure = new ArrayList<>();
        listFigure.add(new Rectangle(2, 2));
        listFigure.add(new Rectangle(3,3));
        listFigure.add(new Rectangle(5,5));
        listFigure.add(new Square(5));
        listFigure.add(new Square(3));

        for (Rectangle rectangle : listFigure){
            rectangle.area();
        }

    }
}
