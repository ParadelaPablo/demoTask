package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

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
}
