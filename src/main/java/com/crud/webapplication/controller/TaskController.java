package com.crud.webapplication.controller;

import com.crud.webapplication.dtos.CreateTaskRequest;
import com.crud.webapplication.model.Task;
import com.crud.webapplication.service.TaskServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tasks")
@AllArgsConstructor
public class TaskController {
	
	private final TaskServiceImpl taskServiceImpl;
	
	@GetMapping
	public List<Task> getAllTasks(){
		return taskServiceImpl.getAllTasks();
	}
	
	@PostMapping
	public Task createNewTask (@RequestBody CreateTaskRequest request) {
		return taskServiceImpl.createTask(request);
	}
}
