package com.hammar.userservices.dao;

import com.hammar.userservices.dto.User;

public interface UserDAO {
	
	void createUser(User u);
	
	User read(int id);

}
