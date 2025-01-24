package com.app.todoapp.services;

import com.app.todoapp.model.Task;
import com.app.todoapp.repositry.TaskRepositry;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
@Service
public class TaskService {
    private final TaskRepositry taskRepositry;

    public TaskService(TaskRepositry taskRepositry) {
        this.taskRepositry = taskRepositry;
    }

    public List<Task> getAllTasks() {
        return taskRepositry.findAll();
    }

    public void createTask(String title) {
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        taskRepositry.save(task);
    }

    public void deleteTask(Long id) {
//        if (taskRepository.existsById(id)) { // Check if the task exists
//            taskRepository.deleteById(id);
//        } else {
//            throw new IllegalArgumentException("Task with ID " + id + " does not exist.");
//        }
        taskRepositry.deleteById(id);
    }
    // it updates if completion state id true
    public void toggleTask(Long id) {
        Task task = taskRepositry.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid Task id"));
        // toggle the work if uncomplete mark as complete or viceversa
        task.setCompleted((!task.isCompleted()));
        //now save into the db
        taskRepositry.save(task);
    }
}
