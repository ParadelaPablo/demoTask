package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class TaskService {
    private final Map<Integer, Task> db = new HashMap<>();

    public TaskService() {
        db.put(19, new Task(19,"kfni", "hffb"));
    }

    public Map<Integer, Task> getTasks() {
        return db;
    }


    public Task getTask(int id) {
        return db.get(id);
    }

    public Task postTask(TaskDto dto) {
        // create a Task
        final int id = (new Random()).nextInt(Integer.MAX_VALUE);
        Task task = new Task(id, dto.description(), dto.name());
        // put the task in the map
        db.put(id, task);
        return task;
    }
}
