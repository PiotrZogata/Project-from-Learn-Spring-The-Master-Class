package com.task.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import com.task.persistence.model.Task;

public interface ITaskRepository extends CrudRepository<Task, Long> {
}