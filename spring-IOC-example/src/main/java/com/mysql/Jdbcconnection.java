package com.mysql;

import org.springframework.beans.factory.annotation.Value;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcconnection {

        @Value("${mysql_username}")
        private String username;
        @Value("${mysql_password}")
        private String password;
        @Value("${mysql_url}")
        private String url;


        public void display_Dbinfo () {
            System.out.println(username + " " + password + " " + url);
        }

        public void getJdbcConnection() throws SQLException {
            Connection con= DriverManager.getConnection(url,username,password);
            String query1="create table channel(chname varchar(40),Subscribers Int (2))";
            Statement stmt= con.createStatement();
            stmt.executeUpdate(query1);
            System.out.println("table inserted successfully");

        }



}
