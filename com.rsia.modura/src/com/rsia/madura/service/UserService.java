package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.s_User;

public interface UserService {
	public List<s_User> getUsers();
	public s_User getUser(int userId);
	
	public void store(s_User userModel);
	public void update(s_User userModel);
	public void delete(s_User userModel);
}
