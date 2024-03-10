package com.examapp.Springserver;

import com.examapp.Springserver.model.users.User;
import com.examapp.Springserver.model.users.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@SpringBootTest
class SpringserverApplicationTests {

	@Autowired
	private UserDao userDao;


	@Test
	void addUserTest() {
		User user = new User();
		user.setName("Liam");
		user.setLastname("Andrees");
		user.setLocation("Visby");
		//user.setBirthDate(LocalDate.of(1960,4,23));
		user.setBirthDate(LocalDate.of(1990, 1,5));
		user.setBirthTime(LocalTime.of(6,30));
		userDao.save(user);
	}




	/*
	@Test
	void getAllAndDeleteUsers(){
		List<User> users = userDao.getAllUsers();
		for(User user: users){
			userDao.delete(user);
		}
		//System.out.println(users);
	}

	 */



}


