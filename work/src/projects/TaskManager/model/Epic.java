package projects.TaskManager.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Epic extends Task {

    private Map<Integer, Subtask> children;


    public Epic(String name, String description) {
        super(name, description);
        this.type = Type.EPIC;
        this.children = new HashMap<>();
    }

    public List<Subtask> getChildren() {
        if(this.children.isEmpty()){
            return new ArrayList<>();
        }
        return new ArrayList<>(this.children.values());
    }

    public void addChild(Subtask subtask){
        if(subtask != null){
            this.children.put(subtask.getId(), subtask);
            this.updateStatus();
        }
    }

    public void delChild(int childId){
        this.children.remove(childId);
        this.updateStatus();
    }

    public void updateStatus(){

        if (children.isEmpty()){
            this.status = Status.NEW;
            return;
        }

        boolean isNew = false;
        boolean isDone = false;
        boolean isProgress = false;

        for (Subtask subtask : children.values()){
            switch (subtask.status){
                case NEW ->  isNew = true;
                case DONE -> isDone = true;
                default -> isProgress = true;
            }

//            if (subtask.status.equals(Status.NEW)){
//                isNew = true;
//            }else if (subtask.status.equals(Status.DONE)){
//                isDone = true;
//            }else {
//                isProgress = true;
//            }
        }

        if ((isNew && isDone) || isProgress){
            this.status = Status.IN_PROGRESS;
        } else {
            this.status = isNew ? Status.NEW : Status.DONE;
        }

    }
}
