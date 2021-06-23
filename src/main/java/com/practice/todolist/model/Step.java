package com.practice.todolist.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="steps")
@NamedQuery(name="Step.findAll", query="SELECT s FROM Step s")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Step implements Serializable {
	static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Lob
	private String description;

	private String name;

	@Column(name="order_in_list")
	private int orderInList;

	//bi-directional many-to-one association to list
	@JoinColumn(name = "list_id")
	@ManyToOne(fetch = FetchType.LAZY)
	private Listed listed;

	//bi-directional many-to-one association to Task
	@OneToMany(mappedBy="step")
	private java.util.List tasks;

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