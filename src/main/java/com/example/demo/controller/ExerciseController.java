package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Exercise;
import com.example.demo.service.ExerciseService;

@RestController
@RequestMapping(path = "/aplication/exercise")
public class ExerciseController {
	private ExerciseService exerciseService;

	public ExerciseController(ExerciseService exerciseService) {
		this.exerciseService = exerciseService;
	}
	@GetMapping(path="/list")
	public List<Exercise>getExercises(){
		return exerciseService.getExercises();
	}

}
