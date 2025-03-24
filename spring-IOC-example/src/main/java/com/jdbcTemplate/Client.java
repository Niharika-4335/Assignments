package com.jdbcTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Client {
    public static void main(String[] args) throws SQLException {
            ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
            Task conn= context.getBean("task", Task.class);
            conn.printDetails();
            conn.getJdbcConnection();
//            conn.saveUser(2,"venkatesh");
            conn.getUserById(1);
//            conn.getUsers();

        }
}
