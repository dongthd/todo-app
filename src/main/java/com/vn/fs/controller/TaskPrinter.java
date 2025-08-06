package com.vn.fs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vn.fs.model.Task;
import com.vn.fs.service.TaskService;

import jakarta.annotation.PostConstruct;

@Component
public class TaskPrinter {

	@Autowired
	private TaskService taskService;

	@PostConstruct
	public void printTasks() {
		taskService.addTask(new Task(1, "Code Spring Boot", "Viết ứng dụng quản lý công việc"));
		taskService.addTask(new Task(2, "Viết README", "Hướng dẫn chạy app"));

		System.out.println("Danh sách công việc:");
		for (Task task : taskService.getTasks()) {
			System.out.println("- " + task.getTitle() + ": " + task.getDescription());
		}
	}
}