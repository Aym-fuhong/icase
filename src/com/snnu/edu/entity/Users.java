package com.snnu.edu.entity;

public class Users {
private int id;
private String uname;
private String upassword;
private String createTime;
private String endTime;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUpassword() {
	return upassword;
}
public void setUpassword(String upassword) {
	this.upassword = upassword;
}
public String getCreateTime() {
	return createTime;
}
public void setCreateTime(String createTime) {
	this.createTime = createTime;
}
public String getEndTime() {
	return endTime;
}
public void setEndTime(String endTime) {
	this.endTime = endTime;
}
public Users(int id,String uname, String upassword, String createTime, String endTime) {
	super();
	this.uname = uname;
	this.upassword = upassword;
	this.createTime = createTime;
	this.endTime = endTime;
}
public Users() {
	super();
}

}
