package com.example.demo;

import java.time.LocalDateTime;



public class Task {

    private int id;
    private String description;
    private String name;
    private LocalDateTime createdAt;

    public Task(int id, String description, String name) {
        this.id = id;
        this.description = description;
        this.name = name;
        createdAt = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}

