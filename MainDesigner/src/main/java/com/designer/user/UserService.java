package com.designer.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Entity.Users;
import repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository user;
	
	public List<Users> getUsres(){
		List<Users> all = new ArrayList<>();
		
		user.findAll().forEach(all :: add);
		return all;
	}
	
}
