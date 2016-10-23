package org.mybatis.annotation.example;

import org.apache.ibatis.annotations.Select;

public interface UserOperationAnnotation {
	
	@Select("select id,userName,corp from user where id =#{id}")
	public User getUser(int id);

}
