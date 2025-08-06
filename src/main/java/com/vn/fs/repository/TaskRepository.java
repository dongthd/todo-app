package com.vn.fs.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vn.fs.model.Task;

@Repository
public class TaskRepository {
	private final List<Task> tasks = new ArrayList<>();

	public List<Task> findAll() {
		return tasks;
	}

	public void save(Task task) {
		tasks.add(task);
	}
}
