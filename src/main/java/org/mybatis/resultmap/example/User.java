package org.mybatis.resultmap.example;

import java.util.ArrayList;

public class User {
	private int id;
	private String userName;
	private String corp;
	private ArrayList<Course> courses;
	
	/*
	 * 在Use类中添加构造函数，需要包含id、userName、corp，
	 * 这三个参数的值必须与UserMapperConstructor.xml中构造器constructor的列名column一致
	 */
	public User(Integer id, String userName, String corp) {
		this.id = id;
		this.userName = userName;
		this.corp = corp;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCorp() {
		return corp;
	}

	public void setCorp(String corp) {
		this.corp = corp;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	public int getId() {
		return id;
	}
	
}
