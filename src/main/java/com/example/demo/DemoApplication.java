package com.example.demo;

import com.example.demo.DAO.UserDAO;
import lombok.val;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	UserDAO userDao;

	@Override
	public void run(String... strings) throws Exception {
		val newUser = new User("12345678","山田太郎");
		userDao.insertUser(newUser);
	}
}
