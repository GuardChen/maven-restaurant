package org.mybatis.annotation.example;

import java.io.InputStream;

import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class UserOperationAnnotationTest {

	public static void main(String[] args) {
		String resource = "confAnnotation.xml";
		InputStream is = UserOperationAnnotationTest.class.getClassLoader()
				.getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		Configuration conf = sessionFactory.getConfiguration();
		conf.addMapper(UserOperationAnnotation.class);
		SqlSession session = sessionFactory.openSession();
		try {
			UserOperationAnnotation uoa = session.getMapper(UserOperationAnnotation.class);
			User user = uoa.getUser(2);
			System.out.println(user.getId() + " " + user.getUserName() + " " + user.getCorp());
		} finally {
			session.close();
		}

		

	}

}
