package com.example.demo.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.example.demo.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void insertUser(User user){
        jdbcTemplate.update(
                "INSERT INTO user(user_id, user_name) VALUES (?,?)",
                user.getId(),user.getName());
    }
}

