package com.examapp.Springserver;

import com.examapp.Springserver.model.users.User;
import com.examapp.Springserver.model.users.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class SpringserverApplicationTests {

	@Autowired
	private UserDao userDao;


	@Test
	void addUserTest() {
		User user = new User();
		user.setName("Bruce");
		user.setLastname("Larzon");
		user.setLocation("New York");
		//user.setBirthDate(LocalDate.of(1960,4,23));
		user.setBirthDate(LocalDate.of(1960, 4,23));
		user.setBirthTime();
		userDao.save(user);

	}

}
