package projects.TaskManager.service;

import projects.TaskManager.model.Epic;
import projects.TaskManager.model.Subtask;
import projects.TaskManager.model.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskManagerImpl implements TaskManager{

    private Map<Integer, Task> taskMap;
    private Map<Integer, Epic> epicMap;
    private Map<Integer, Subtask> subtaskMap;

    public TaskManagerImpl() {
        this.taskMap = new HashMap<>();
    }

    @Override
    public void addTask(Task task) {
        this.taskMap.put(task.getId(), task);
        System.out.println("Задача с типом: " + task.getType() + ", названием: '" + task.getName() + "' добавлена");
    }

    @Override
    public List<Task> getTasks() {
        if(this.taskMap.isEmpty()){
            System.out.println("Список задач пуст");
            return new ArrayList<>();
        }

        return new ArrayList<>(this.taskMap.values());
    }

    @Override
    public Task getTaskById(int id) {
        if(!this.taskMap.containsKey(id)){
            System.out.println("Задачи с таким id нет: " + id);
            return null;
        }

        return this.taskMap.get(id);
    }

    @Override
    public void deleteTaskById(int id) {
        if(!this.taskMap.containsKey(id)){
            System.out.println("Задачи с таким id нет: " + id);
            return;
        }

        Task task = this.taskMap.get(id);
        this.taskMap.remove(id);
        System.out.println("Задача с типом: " + task.getType() + ", названием: '" + task.getName() + "' удалена");
    }
    @Override
    public void updateTask(Task task, int id) {
        if (!this.taskMap.containsKey(id)){
            System.out.println("Задачи с таким id нет: " + id);
            return;
        }
        task.setId(id);
        this.taskMap.put(id, task);
        System.out.println("Задача с типом: " + task.getType() + ", названием: '" + task.getName() + "' обновлена");
    }


    @Override
    public void printInfoAllTasksType() {
        System.out.println(getTasks());
    }
}
