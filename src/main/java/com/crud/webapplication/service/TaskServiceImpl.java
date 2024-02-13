package com.crud.webapplication.service;

import com.crud.webapplication.dtos.CreateTaskRequest;
import com.crud.webapplication.model.Task;
import com.crud.webapplication.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {
	
	private final TaskRepository taskRepository;
	
	@Override
	public List<Task> getAllTasks(){
		return taskRepository.findAll();
	}
	
	
	public Task createTask(CreateTaskRequest requestBody){
		Task task = Task
				.builder()
				.title(requestBody.getTitle())
				.description(requestBody.getDescription())
				.build();
		
		return taskRepository.save(task);
	}
}
