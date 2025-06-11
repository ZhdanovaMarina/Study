package projects.TaskManager.service;

import projects.TaskManager.model.Task;

import java.util.List;

public interface TaskManager {
    // todo добавить методы для остальных типов задач
    void addTask(Task task);
    List<Task> getTasks();
    Task getTaskById(int id);
    void updateTask(Task task, int id);
    void deleteTaskById(int id);


    
    void printInfoAllTasksType();




}
