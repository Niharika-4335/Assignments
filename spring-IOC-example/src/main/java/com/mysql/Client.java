package com.mysql;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Client {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
       Jdbcconnection conn= context.getBean("jdbc", Jdbcconnection.class);
       conn.display_Dbinfo();
       conn.getJdbcConnection();

    }
}
