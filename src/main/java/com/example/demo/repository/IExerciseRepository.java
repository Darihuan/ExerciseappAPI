package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Exercise;

public interface IExerciseRepository  extends JpaRepository<Exercise, Long>{

}
