package hw_22_04_2025.task_6;

public class Main {
    public static void main(String[] args) {

        Attraction[] attractions = new Attraction[3];
        attractions[0] = new Carousel();
        attractions[1] = new RollerCoaster();
        attractions[2] = new HauntedHouse();

        Park park = new Park(attractions);

        park.openAll();




    }
}
