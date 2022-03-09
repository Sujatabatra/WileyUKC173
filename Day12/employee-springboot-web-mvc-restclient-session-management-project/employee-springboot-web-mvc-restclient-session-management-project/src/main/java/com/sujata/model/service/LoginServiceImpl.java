package com.sujata.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.entity.User;
import com.sujata.model.persistence.UserDao;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	UserDao userDao;
	
	@Override
	public boolean loginCheck(User user) {
		User usr=userDao.findUserByUserNameAndPassword(user.getUserName(), user.getPassword());
		if(usr!=null)
			return true;
		return false;
	}

}
