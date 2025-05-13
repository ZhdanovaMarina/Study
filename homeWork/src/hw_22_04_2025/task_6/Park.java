package hw_22_04_2025.task_6;

public class Park {
    //    List<Attraction> attractions = new ArrayList<>();
    private Attraction[] attractions;

    public Park(Attraction[] attractions) {
        this.attractions = attractions;
    }

    public void openAll() {
        int sum = 0;
        for (Attraction attraction : attractions) {
            attraction.ride();
            sum += attraction.capacity();
        }
        System.out.println("Общая пропускная способность: " + sum);
    }
}
