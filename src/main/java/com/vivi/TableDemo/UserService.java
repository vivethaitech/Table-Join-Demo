package com.vivi.TableDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
    private UserRepository repo;

	public String createUser(UserEntity user) {
		repo.save(user);
		return "added successfully";
	}

	public List<UserEntity> getUser() {
		
		return repo.findAll();
	}
	

}
