package org.mybatis.resultmap.example;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConstructorTest {

	public static void main(String[] args) {
		String resource = "conf.xml";
		InputStream is = MyBatisConstructorTest.class.getClassLoader()
				.getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = sessionFactory.openSession(true);
		try {
			UserOperation userop = session.getMapper(UserOperation.class);
			User user = userop.getUser(2);
			System.out.println(user.getId() + " " + user.getUserName() + " ");
//			System.out.println(user.getCourses().get(0).getCourseName());
		} finally {
			session.close();
		}
	}
}
