package com.femi.tasktracker.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import com.femi.tasktracker.model.Task;

@Service
public class TaskService {
    private final Map<String, Task> tasks = new ConcurrentHashMap<>();

    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks.values());
    }
    public Optional<Task> getTask(String id) {
        return Optional.ofNullable(tasks.get(id));
    }
    public Task createTask(Task task) {
        String id = UUID.randomUUID().toString();
        task.setId(id);
        tasks.put(id, task);
        return task;
    }
    public Optional<Task> updateTask(String id, Task updated) {
        if (tasks.containsKey(id)) {
            updated.setId(id);
            tasks.put(id, updated);
            return Optional.of(updated);
        }
        return Optional.empty();
    }
    public boolean deleteTask(String id) {
        return tasks.remove(id) != null;
    }
}
