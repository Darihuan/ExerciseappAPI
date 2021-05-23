package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
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
	public void addExercise(Exercise exercise) {
		
		if(exercise.getNameExercise()!=null &&exercise.getTimeInMinutes()!=0) {
		
		exerciserepository.save(exercise);
		
		}else {
			throw new IllegalStateException("datos incorrectos");
		}
		
	}
	public void updateExercise(Exercise exercise,Long id) {
		Exercise completo=new Exercise(id,exercise.getNameExercise(),exercise.getTimeInMinutes());
		exerciserepository.deleteById(id);
		exerciserepository.save(completo);
		
	}
	public void deleteExercise(Long id) {
		exerciserepository.deleteById(id);
		
	}
	
	

}
