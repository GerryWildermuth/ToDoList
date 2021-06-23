package com.practice.todolist.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import javax.persistence.*;



@Entity
@Table(name="tasks")
@NamedQuery(name="Task.findAll", query="SELECT t FROM Task t")
@Data
@AllArgsConstructor
@NoArgsConstructor
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
	@JoinColumn(name="state_name")
	private State stateBean;

	//bi-directional many-to-one association to Step
	@ManyToOne
	private Step step;

}