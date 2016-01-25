package com.emc.data;

import org.springframework.data.mongodb.repository.MongoRepository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.emc.domain.User;


public interface UserRepository extends MongoRepository<User, String> {
	

}
