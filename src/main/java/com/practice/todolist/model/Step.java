package com.practice.todolist.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the steps database table.
 * 
 */
@Entity
@Table(name="steps")
@NamedQuery(name="Step.findAll", query="SELECT s FROM Step s")
public class Step implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Lob
	private String description;

	private String name;

	@Column(name="order_in_todolist")
	private int orderInTodolist;

	//bi-directional many-to-one association to Todolist
	@ManyToOne
	private Todolist todolist;

	//bi-directional many-to-one association to Task
	@OneToMany(mappedBy="step")
	private List<Task> tasks;

	public Step() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOrderInTodolist() {
		return this.orderInTodolist;
	}

	public void setOrderInTodolist(int orderInTodolist) {
		this.orderInTodolist = orderInTodolist;
	}

	public Todolist getTodolist() {
		return this.todolist;
	}

	public void setTodolist(Todolist todolist) {
		this.todolist = todolist;
	}

	public List<Task> getTasks() {
		return this.tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public Task addTask(Task task) {
		getTasks().add(task);
		task.setStep(this);

		return task;
	}

	public Task removeTask(Task task) {
		getTasks().remove(task);
		task.setStep(null);

		return task;
	}

}