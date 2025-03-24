package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employee {
    public static void main(String[] args) {
        try{
            Connection conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeeobjects","root","root");
            String query= "CREATE TABLE IF NOT EXISTS employee(empid INT PRIMARY KEY,empname VARCHAR(40),empsal FLOAT(2))";
            Statement stmt=conn.createStatement();
            stmt.executeUpdate(query);
            String query1="INSERT INTO EMPLOYEE VALUES(1,'NIHARIKA',3000.00)";
            stmt.executeUpdate(query1);
            ResultSet resultSet=stmt.executeQuery("SELECT * FROM employee");
            while(resultSet.next()){
                System.out.println(resultSet.getInt("empid") + " "+resultSet.getString("empname"));
            }
        conn.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
