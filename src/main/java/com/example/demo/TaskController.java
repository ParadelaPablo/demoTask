package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Map;

@RestController
@RequestMapping("api")
public class TaskController {
    private final TaskService service;
    @Autowired
    public TaskController(TaskService service) {

        this.service = service;
    }

    @GetMapping("tasks")
    public Map<Integer, Task> getAllTasks() {

        return service.getTasks();
    }

    @GetMapping("tasks/{id}")
    public Task getTask(@PathVariable int id) {
        return service.getTask(id);
    }


}
