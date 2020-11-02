package com.task.service.impl;

import java.util.Optional;

import com.task.persistence.model.Task;
import com.task.persistence.repository.ITaskRepository;
import com.task.service.ITaskService;

public class TaskServiceImpl implements ITaskService{

	 private ITaskRepository taskRepository;

	    public TaskServiceImpl(ITaskRepository taskRepository) {
	        this.taskRepository = taskRepository;
	    }

	    @Override
	    public Optional<Task> findById(Long id) {
	        return taskRepository.findById(id);
	    }

	    @Override
	    public Task save(Task project) {
	        return taskRepository.save(project);
	    }
	}