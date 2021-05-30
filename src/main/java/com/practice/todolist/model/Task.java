package com.practice.todolist.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tasks database table.
 * 
 */
@Entity
@Table(name="tasks")
@NamedQuery(name="Task.findAll", query="SELECT t FROM Task t")
public class Task implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Lob
	private String description;

	private String name;

	@Column(name="order_in_steplist")
	private int orderInSteplist;

	//bi-directional many-to-one association to State
	@ManyToOne
	@JoinColumn(name="state")
	private State stateBean;

	//bi-directional many-to-one association to Step
	@ManyToOne
	private Step step;

	public Task() {
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

	public int getOrderInSteplist() {
		return this.orderInSteplist;
	}

	public void setOrderInSteplist(int orderInSteplist) {
		this.orderInSteplist = orderInSteplist;
	}

	public State getStateBean() {
		return this.stateBean;
	}

	public void setStateBean(State stateBean) {
		this.stateBean = stateBean;
	}

	public Step getStep() {
		return this.step;
	}

	public void setStep(Step step) {
		this.step = step;
	}

}