package com.snnu.edu.serviceInterface;

import java.util.List;

import com.snnu.edu.dao.BaseDao;
import com.snnu.edu.entity.User;

public interface UserService {
	public  boolean saveOrUpdateUsers(User user);
	
	public  boolean delUserInfo(User user);
	
	public  User getUserById(String id);
	public  List<User>findWithPage();
}
