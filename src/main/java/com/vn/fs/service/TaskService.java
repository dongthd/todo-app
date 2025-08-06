package com.vn.fs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vn.fs.model.Task;
import com.vn.fs.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;

	public void addTask(Task task) {
		taskRepository.save(task);
	}

	public List<Task> getTasks() {
		return taskRepository.findAll();
	}
}