package com.snnu.edu.serviceInterface;

import java.util.List;

import com.snnu.edu.dao.BaseDao;
import com.snnu.edu.entity.Users;

public interface UserService {
	public  boolean saveOrUpdateUsers(Users user);
	
	public  boolean delUserInfo(Users user);
	
	public  Users getUserById(String id);
	public  List<Users>findWithPage();
}
