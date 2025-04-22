package work_18_04_2025.hw.task_3;

public class DeleteText implements Command{

    private final int pos;
    private final int len;

    public DeleteText(int pos, int len) {
        this.pos = pos;
        this.len = len;
    }

    @Override
    public void execute() {
        Editor.delete(pos, len);
    }

    @Override
    public void undo() {

    }
}
