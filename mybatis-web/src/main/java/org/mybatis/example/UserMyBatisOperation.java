package org.mybatis.example;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class UserMyBatisOperation {

	public static void main(String[] args) {
		String resource = "conf.xml";
		InputStream is = UserMyBatisOperation.class.getClassLoader()
				.getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = sessionFactory.openSession(true);
		try {
			UserOperation userop = session.getMapper(UserOperation.class);
//			User user = new User("XiaoLiu", "Netease");
//			userop.addUser(user);
//			System.out.println(user.getId());			
//			//查询用户
//			user = userop.getUser(user.getId());
//			System.out.println("userId:" + user.getId() + " , userName:" + user.getUserName() + " , corp:" + user.getCorp());
//			user.setUserName("LiMing");
//			userop.updateUser(user);
//			userop.deleteUser(user.getId());
			
//			User user = userop.getUser(1);
//			System.out.println(user.getId() + " " + user.getUserName() + " " + user.getCorp());
		} finally {
			session.close();
		}
		

	}

}
