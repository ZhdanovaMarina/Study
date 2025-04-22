package work_09_04_2025.ex_inheritance;

public class Car extends Vehicle{

    private String brand;

    public Car(String brand, String color, int speed){

        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    @Override
    public void move(){
        System.out.println("Car "+ brand + " is moving");
    }

    public void beep(){
        System.out.println("Beeeeep!");
    }

}
