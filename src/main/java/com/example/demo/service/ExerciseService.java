package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Exercise;
import com.example.demo.repository.IExerciseRepository;

@Service
public class ExerciseService {
	
	private IExerciseRepository exerciserepository;
	@Autowired
	public ExerciseService( IExerciseRepository exerciserepository) {
		this.exerciserepository=exerciserepository;
	}
	public List<Exercise> getExercises() {
		
		return exerciserepository.findAll();
	}
	
	

}
