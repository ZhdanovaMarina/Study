package hw_22_04_2025.task_6;

public class RollerCoaster extends Attraction{
    @Override
    void ride() {
        System.out.println("Горки: пора кататься");
    }

    @Override
    int capacity() {
        return 12;

    }
}
