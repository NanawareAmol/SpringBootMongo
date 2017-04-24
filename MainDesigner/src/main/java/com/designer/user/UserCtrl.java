package com.designer.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Entity.Users;
import repository.UserRepository;

@RestController
public class UserCtrl {
//	@Autowired(required=true)
//	UserService user;
//	
//	@RequestMapping(method=RequestMethod.GET, value="/users")
//	public List<Users> allUsers(){
//		return user.getUsres();
//	}
	
	@Autowired
	UserRepository user;
	
	@RequestMapping(method=RequestMethod.GET, value="/users")
	public List<Users> getUsres(){
		List<Users> all = new ArrayList<>();
		user.findAll().forEach(all :: add);
		return all;
	}
	
}
