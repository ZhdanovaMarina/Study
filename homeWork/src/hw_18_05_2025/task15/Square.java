package hw_18_05_2025.task15;

import hw_18_05_2025.task9.Rectangle;

public class Square extends Rectangle {
    private double side;


    public Square(double side){
        super();
        this.side = side;
    }

    public void setWidht(double widht) {

    }

    @Override
    public String toString() {
        return "Square " + "(" + side + ")";
    }
}
