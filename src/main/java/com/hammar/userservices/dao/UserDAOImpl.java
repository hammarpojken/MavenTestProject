package com.hammar.userservices.dao;

import java.util.HashMap;
import java.util.Map;

import com.hammar.userservices.dto.User;

public class UserDAOImpl implements UserDAO {
	
	Map<Integer, User> users = new HashMap<>();

	public void createUser(User u) {
		users.put(u.getId(), u);

	}

	public User read(int id) {
		
		return users.get(id);
	}

}
