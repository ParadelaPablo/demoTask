package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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

    @PostMapping("tasks")
    public Task postTask(@RequestBody TaskDto dto) {
        return service.postTask(dto);
    }
}
