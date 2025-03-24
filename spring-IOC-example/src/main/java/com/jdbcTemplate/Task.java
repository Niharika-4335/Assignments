package com.jdbcTemplate;

import org.springframework.beans.factory.annotation.Value;

import java.sql.*;

public class Task {
    @Value("${mysql_username}")
    private String username;

    @Value("${mysql_password}")
    private String password;

    @Value("${mysql_url}")
    private String url;

    private Connection connection;
    public void init() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connection established.");
        }
    }

    public void closeConnection() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
            System.out.println("Database connection closed.");
        }
    }

    public void printDetails(){
        System.out.println(username +" "+password+" "+url);
    }
    public void getJdbcConnection() throws SQLException {
        init();
        String query1="create table if not exists users(uname varchar(40), uid int (2) primary key)";
        Statement stmt= connection.createStatement();
        stmt.executeUpdate(query1);
        System.out.println("table inserted successfully");

    }

    public void saveUser(int uid,String uname) throws SQLException {
        init();
        String query1="insert into users (uid,uname) values (?,?)";
        PreparedStatement stmt= connection.prepareStatement(query1);
        stmt.setInt(1,uid);
        stmt.setString(2, uname);
        stmt.executeUpdate();
        System.out.println("details inserted successfully");

    }

    public void getUserById(int uid) throws SQLException {
       init();
        PreparedStatement preparedStatement=connection.prepareStatement("select uname from users where uid=?");
        preparedStatement.setInt(1,uid);
        ResultSet resultSet=preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString("uname"));
        }


    }

    public void getUsers() throws SQLException {
        init();
        Statement stmt=connection.createStatement();
        ResultSet resultSet=stmt.executeQuery("select uname from users");
        while(resultSet.next()){
            System.out.println(resultSet.getString("uname"));
        }
    }

}
