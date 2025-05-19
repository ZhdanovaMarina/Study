package projects.TaskManager;

public class Subtask extends Task {
    private Epic parent;

    public Subtask(String name, String description, Epic parent) {
        super(name, description);
        this.parent = parent;
    }
}
