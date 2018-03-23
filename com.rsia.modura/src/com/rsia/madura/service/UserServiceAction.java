package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.UserDAO;
import com.rsia.madura.entity.s_User;

@Service
public class UserServiceAction implements UserService {
	@Autowired
	private UserDAO userDAO;
	
	@Override
	@Transactional
	public List<s_User> getUsers() {
		
		return userDAO.getUsers();
	}

	@Override
	@Transactional
	public s_User getUser(int userId) {
		
		return userDAO.getUser(userId);
	}

	@Override
	@Transactional
	public void store(s_User userModel) {
		
		userDAO.userStore(userModel);

	}

	@Override
	@Transactional
	public void update(s_User userModel) {
		
		userDAO.userUpdate(userModel);

	}

	@Override
	@Transactional
	public void delete(s_User userModel) {
		
		userDAO.userDelete(userModel);

	}

}
