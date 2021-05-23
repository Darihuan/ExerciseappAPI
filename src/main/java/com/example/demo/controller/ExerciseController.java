package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Exercise;
import com.example.demo.service.ExerciseService;

@RestController
@RequestMapping(path = "/aplicacion/exercise")
public class ExerciseController {
	private ExerciseService exerciseService;

	public ExerciseController(ExerciseService exerciseService) {
		this.exerciseService = exerciseService;
	}
	@GetMapping(path="/list")
	public List<Exercise>getExercises(){
		return exerciseService.getExercises();
	}
	@PostMapping
	public void addexercise(@RequestBody Exercise exercise) {
		exerciseService.addExercise(exercise);
	}
	@PutMapping(path="/{id}")
	public void updateexercise(@RequestBody Exercise exercise, @PathVariable("id") Long id) {
		exerciseService.updateExercise(exercise,id);
	}
	@DeleteMapping(path="{id}")
	public void deleteexercise(@PathVariable("id") Long id) {
		exerciseService.deleteExercise(id);
	}

}
