package projects.TaskManager.model;

import projects.TaskManager.util.Identifier;

public class Task {
    protected int id;

    protected String name;
    protected String description;
    protected Status status;
    protected Type type;

    public Task(String name, String description) {
        this.id = Identifier.INSTANCE.generate();
        this.name = name;
        this.description = description;
        this.status = Status.NEW;
        this.type = Type.TASK;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", type=" + type +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }
}
