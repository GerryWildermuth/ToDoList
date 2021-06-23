package com.practice.todolist.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;



@Entity
@Table(name="states")
@NamedQuery(name="State.findAll", query="SELECT s FROM State s")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class State implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String name;

	//bi-directional many-to-one association to Task
	@OneToMany(mappedBy="stateBean")
	private List<Task> tasks;

	public Task addTask(Task task) {
		getTasks().add(task);
		task.setStateBean(this);

		return task;
	}

	public Task removeTask(Task task) {
		getTasks().remove(task);
		task.setStateBean(null);

		return task;
	}

}