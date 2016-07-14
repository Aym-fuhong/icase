
package com.snnu.edu.serviceInterface.impl;
import java.util.List;

import com.snnu.edu.dao.BaseDao;
import com.snnu.edu.entity.User;
import com.snnu.edu.serviceInterface.UserService;
@SuppressWarnings("unchecked")
public class UserServiceImpl implements UserService{
	
	public   boolean saveOrUpdateUsers(User user){
		try {
			BaseDao.saveOrUpdateObj(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return false;
		
	}
	
	public   boolean delUserInfo(User user){
		try {
			BaseDao.deleteObj(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return false;
		
	}
	
	public  User getUserById(String id){
		return (User)BaseDao.getObject("from Users where id='"+id+"'");
	}
	
	
	public  List<User>findWithPage(){
		return (List<User>)BaseDao.findWithPage("from Users ");
	} 

}
