package com.practice.todolist.repository;

import com.practice.todolist.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
* Generated by Springboot-3layer-Generator at 28.05.2021, 19:11:25
*/
@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

}