package com.app.todoapp.repositry;

import com.app.todoapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepositry extends JpaRepository<Task,Long> {

}
