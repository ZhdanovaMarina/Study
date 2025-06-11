package projects.TaskManager.util;

public enum Identifier {

    INSTANCE;

    private int id = 0;

    public int generate(){
        return ++id;
    }

}
