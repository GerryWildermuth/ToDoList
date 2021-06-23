package com.practice.todolist;

import com.practice.todolist.model.Listed;
import com.practice.todolist.model.State;
import com.practice.todolist.model.Step;
import com.practice.todolist.model.Task;
import com.practice.todolist.repository.ListedRepository;
import com.practice.todolist.repository.StateRepository;
import com.practice.todolist.repository.StepRepository;
import com.practice.todolist.repository.TaskRepository;
import com.practice.todolist.service.ListedService;
import com.practice.todolist.service.StepService;
import com.practice.todolist.service.impl.StepServiceBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TodolistApplication {

	private final ListedRepository listedRepository;

	private final StateRepository stateRepository;

	private final StepRepository stepRepository;

	private final TaskRepository taskRepository;

	public TodolistApplication(ListedRepository listedRepository, StateRepository stateRepository, StepRepository stepRepository, TaskRepository taskRepository) {
		this.listedRepository = listedRepository;
		this.stateRepository = stateRepository;
		this.stepRepository = stepRepository;
		this.taskRepository = taskRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);


	}
/*

	@Bean
	InitializingBean sendDatabase() {
		return () -> {

			Step step = new Step();
			State state = new State();
			Listed listed = new Listed();
			Task task = new Task();

			taskRepository.save(task);
			step.addTask(task);
			state.addTask(task);
			stateRepository.save(state);
			stepRepository.save(step);
			listed.addStep(step);
			listedRepository.save(listed);
		};
	}
*/

}
