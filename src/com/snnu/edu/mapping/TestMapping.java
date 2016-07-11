package com.snnu.edu.mapping;

import com.snnu.edu.entity.Users;
import com.snnu.edu.serviceInterface.UserService;
import com.snnu.edu.serviceInterface.impl.UserServiceImpl;




public class TestMapping {
	
//	public void testSave(){
//		BaseDao.saveUser(new Users("000000", "2016-03-19", "2018-03-19", "����2"));
//	}
//	
//	public void testDel(){
//		Users user=new Users();
//		user.setId("40288247538d9cb101538d9cb2100001");
//		BaseDao.delUser(user);
//	}
//	
//	public void testUpdate(){
//		
//		BaseDao.updateUser(new Users("40288247538d9cb101538d9cb2100001","111111", "2016-03-19", "2018-03-19", "����"));
//	}
//	public void testFind(){
//		
//		List<Users> list=BaseDao.findUserALLInfo();
//		for(Users u:list){
//			System.out.println(u.getId()+"  "+u.getUserName());
//		}
//	}
	
	public static void main(String[] args) {
//		Configuration  cfg=new Configuration().configure();
//		SchemaExport export=new SchemaExport(cfg);
//		export.create(true, true);
		Users user = new Users(1,"000000","张三", "2016-03-19", "2018-03-19");
		UserService  us = new UserServiceImpl();
	    us.saveOrUpdateUsers(user);
		
	}

}
