package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name="user")
@Table(name="user")
public class User {
	@Id
	@SequenceGenerator(name = "User_sequence", sequenceName = "User_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "User_sequence")
	private long id;
	private String email;
	private String password;
    /**
     * 
     */
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
        )
        private List<Exercise> exerciselist;
	


	public User(long id, String email, String password) {
		this.id = id;
		this.email = email;
		this.password = password;
	}

	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public User() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Exercise> geteercises() {
		return exerciselist;
	}

	public void setExercises(List<Exercise> comments) {
		this.exerciselist = comments;
	}
}
