package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager {
    public static void main(String[] args) throws SQLException {
        Connection conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeeobjects","root","root");
        String query="CREATE TABLE IF NOT EXISTS department (deptid INT PRIMARY KEY,deptname VARCHAR(50),empid INT, FOREIGN KEY (empid) REFERENCES employee(empid))";
        Statement stmt=conn.createStatement();
        stmt.executeUpdate(query);
        System.out.println("table added");
        String query1="INSERT INTO department values(1,'developer',1)";
        stmt.executeUpdate(query1);
        System.out.println("details added");

        System.out.println("niharika");

    }
}
