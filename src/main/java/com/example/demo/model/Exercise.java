package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name="exercise")
@Table(name = "exercise")
public class Exercise implements Serializable {
	@Id
	@SequenceGenerator(name = "exercise_sequence", sequenceName = "exercise_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "exercise_sequence")
	private long id;
	private String nameExercise;
	private int timeInMinutes;
	




	public Exercise(long id, String nameExercise, int timeinminutes) {
		this.id = id;
		this.nameExercise = nameExercise;
		this.timeInMinutes = timeinminutes;

	}

	public Exercise(String nameExercise, int timeinminutes) {
		this.nameExercise = nameExercise;
		this.timeInMinutes = timeinminutes;

	}

	public Exercise() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameExercise() {
		return nameExercise;
	}

	public void setNameExercise(String nameExercise) {
		this.nameExercise = nameExercise;
	}

	public int getTimeInMinutes() {
		return timeInMinutes;
	}

	public void setTimeInMinutes(int timeInMinutes) {
		this.timeInMinutes = timeInMinutes;
	}




}
