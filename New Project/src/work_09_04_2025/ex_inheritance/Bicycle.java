package work_09_04_2025.ex_inheritance;

public class Bicycle extends Vehicle{
    private int gearCount;

    public Bicycle( String color, int speed, int gearCount){
        this.gearCount = gearCount;
        this.color = color;
        this.speed = speed;
    }

    @Override
    public void move(){
        System.out.println("Bicycle is moving with gear " + gearCount);
    }

}
