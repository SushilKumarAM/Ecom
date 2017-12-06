package com.niit.DAO;

import java.util.List;

import com.niit.model.User;

public interface UserDAO {
	
List<User> getAllUserDetails();
	
	User getUserDetail(String id);
	
	void updateUserDetail(User obj);
	public boolean addUser(User user);


	void deleteUser(User entity);

}
