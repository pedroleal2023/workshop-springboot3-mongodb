package com.coursests.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coursests.workshopmongo.domain.User;
import com.coursests.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;  
	
	public List <User> findAll(){
		return repo.findAll();
	}
}

