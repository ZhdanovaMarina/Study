package hw_18_05_2025.task12;

import hw_18_05_2025.task11.Square;
import hw_18_05_2025.task9.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Rectangle> listFigure = new ArrayList<>();

        listFigure.add(new Rectangle());
        listFigure.add(new Rectangle());
        listFigure.add(new Rectangle());

        listFigure.add(new Square(2.0));
        listFigure.add(new Square(3.0));

        for (Rectangle rectangle : listFigure){
            rectangle.area();
        }




    }
}
