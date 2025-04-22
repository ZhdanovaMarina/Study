package work_18_04_2025.hw.task_3;

public class InsertText implements Command{
    private final int pos;
    private final String text;

    public InsertText(int pos, String text) {
        this.pos = pos;
        this.text = text;
    }

    @Override
    public void execute() {
        Editor.insert(pos, text);
    }

    @Override
    public void undo() {
        Editor.delete(pos, text.length());
    }
}
