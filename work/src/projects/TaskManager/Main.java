package projects.TaskManager;

import projects.TaskManager.model.Task;
import projects.TaskManager.service.TaskManager;
import projects.TaskManager.service.TaskManagerImpl;

public class Main {

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManagerImpl();


        Task task = new Task("задача", "Описание задачи");

        taskManager.addTask(task); // добавление задачи

        System.out.println(taskManager.getTasks()); // получение всех задач

        Task updateTask = new Task("Обновленная задача", "Описание обновленной задачи");
        taskManager.updateTask(updateTask, task.getId()); // обновление задачи

        System.out.println(taskManager.getTaskById(task.getId())); // поулчение по id

        taskManager.deleteTaskById(task.getId()); // удаление по id

        taskManager.printInfoAllTasksType();


    }

}
