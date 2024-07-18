package com.coursests.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coursests.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserRsource {

	@GetMapping
	public ResponseEntity<List<User>> findAll() {

		User maria = new User("1", "Maria", "maria@gmail.com");
		User joao = new User("2", "José", "jose@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, joao));
		return ResponseEntity.ok().body(list);
	}
}
