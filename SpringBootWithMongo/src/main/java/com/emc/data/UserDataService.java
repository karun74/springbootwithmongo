package com.emc.data;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.emc.domain.User;
import com.mongodb.Mongo;



@Service
public class UserDataService {

	@Autowired
	UserRepository userRepo;
	
	@Autowired
	public UserDataService(UserRepository repository) {
        this.userRepo = repository;
    }
	
	public void storeUser(User u){
		User ulocal = userRepo.save(u);
		System.out.println("Saved User in DB: "+ulocal);
	}
	
	public User getUserByUserName(String uname){
		return userRepo.findOne(uname);
	}
	
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
}
