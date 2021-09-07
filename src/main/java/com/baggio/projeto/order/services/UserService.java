package com.baggio.projeto.order.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baggio.projeto.order.entities.User;
import com.baggio.projeto.order.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> userOptional = userRepository.findById(id); 
		return userOptional.get();
	}
	
	public User insert(User obj) {
		return userRepository.save(obj);
	}
	
}
