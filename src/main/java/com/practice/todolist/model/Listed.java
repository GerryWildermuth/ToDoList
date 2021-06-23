package com.practice.todolist.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="lists")
@NamedQuery(name="list.findAll", query="SELECT t FROM list t")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Listed implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Lob
	private String description;

	private String name;

	private int orderNr;

	//bi-directional many-to-one association to Step
	@OneToMany(mappedBy= "listed")
	private java.util.List<Step> steps;

	public Step addStep(Step step) {
		getSteps().add(step);
		step.setListed(this);

		return step;
	}

	public Step removeStep(Step step) {
		getSteps().remove(step);
		step.setListed(null);

		return step;
	}

}