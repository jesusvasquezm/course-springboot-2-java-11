package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.User;
import com.example.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	//Operação básica para salvar um user no banco de dados - CREATE
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	//Operação básica para a deleção do user - DELETE
	public void delete(Long id) {
		repository.deleteById(id);
	}

}
