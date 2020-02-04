package com.ctgu.qmx.springbootbase;

import com.ctgu.qmx.springbootbase.entity.User;
import com.ctgu.qmx.springbootbase.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootBaseApplicationTests {

	@Resource
	private UserMapper mapper;

	@Autowired
	DataSource dataSource;

	@Test
	void doSelect(){
		System.out.println(mapper.selectList(null));
	}

	@Test
	void doMySelect(){
		User user = new User();
		user.setId(1);
		System.out.println(mapper.mySelectUserById(user));
	}

	@Test
	public void contextLoads() throws SQLException {
		Connection connection = dataSource.getConnection();
		PreparedStatement prepareStatement = connection
				.prepareStatement("select * from user");
		ResultSet resultSet = prepareStatement.executeQuery();
		System.out.println(resultSet);
	}
}
