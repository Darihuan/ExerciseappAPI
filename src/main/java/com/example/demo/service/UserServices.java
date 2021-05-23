package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Exercise;
import com.example.demo.model.User;
import com.example.demo.repository.IUserRepository;
@Service
public class UserServices {
	
	private IUserRepository userrepository;
	@Autowired
	public UserServices(IUserRepository userrepository) {
		this.userrepository=userrepository;
	}
	public List<User> listusers() {
		
		return userrepository.findAll();
	}
	public User getUserbyid(long id) {
		return userrepository.findById(id).get();
		
	}
	public void addUser(User user) {
		if(user.getEmail()!=null&&user.getPassword()!=null) {
		User saveuser=new User(user.getEmail(),user.getPassword());
		
		userrepository.save(saveuser);}
		else {
			throw new IllegalStateException("Error datos incorrectos");
		}
		
	}

	public void addExercise(Exercise exercise, Long id) {
		userrepository.findById(id).get().setExercises(List.of(exercise));
		
	}
	
	
	
	
	

}
