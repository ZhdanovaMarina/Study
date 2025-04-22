package work_18_04_2025.hw.task_3;

public class Editor {

    private static StringBuilder content = new StringBuilder();

    public static void insert(int pos, String text) {
        content.insert(pos, text);
    }

    public static void delete(int pos, int len) {
        content.delete(pos, pos + len);
    }

    public static String getContent(){
        return content.toString();
    }


}
