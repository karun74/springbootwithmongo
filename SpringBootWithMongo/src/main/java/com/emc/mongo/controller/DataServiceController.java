package com.emc.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.emc.data.UserDataService;
import com.emc.domain.User;

@RestController
public class DataServiceController {
	
	@Autowired
	UserDataService uds;
	
	@Autowired
	DataServiceController(UserDataService service) {
        this.uds = service;
    }
	
	@RequestMapping(value="/registerUser",method=RequestMethod.POST,
                produces={"application/json"},consumes={"text/plain"})
	public void saveUser(@RequestBody User u){
		System.out.println("Saving User: "+u.getUserName());
		uds.storeUser(u);
	}
	
	@RequestMapping(value="/users/{userName}", method=RequestMethod.GET)
	public  User getUserByUserName(@PathVariable("userName") String userName){
		System.out.println("getiing User detail of: "+userName);
		return uds.getUserByUserName(userName);
				
	}
	
	@RequestMapping(value="/showUsers", method=RequestMethod.GET)
	public List<User> getAllUsers(){
		return uds.getAllUsers();
	}

}
