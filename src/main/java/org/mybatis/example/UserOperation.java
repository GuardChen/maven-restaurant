package org.mybatis.example;

public interface UserOperation {
	
	public User getUser(int id);
	
	public void updateUser(User user);
	
	public void addUser(User user);
	
	public void deleteUser(int id);

}
