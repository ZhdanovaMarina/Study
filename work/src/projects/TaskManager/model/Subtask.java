package projects.TaskManager.model;

public class Subtask extends Task {
    private Epic parent;

    public Subtask(String name, String description, Epic parent) {
        super(name, description);
        this.type = Type.SUBTASK;
        this.parent = parent;
    }

    public Epic getParent() {
        return parent;
    }

}
