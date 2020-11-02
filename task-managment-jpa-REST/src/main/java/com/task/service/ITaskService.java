package com.task.service;

import java.util.Optional;

import com.task.persistence.model.Task;

public interface ITaskService {

	Optional<Task> findById(Long id);

    Task save(Task project);
}
