package JDBC;

import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) {
        try{
            Connection conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employee","root","root");
             String query1="INSERT INTO employee(id,name,salary,dept) VALUES(?,?,?,?)";
            PreparedStatement statement= conn.prepareStatement(query1);
//            String query1="delete  from employee where id=1";
            statement.setInt(1,3);
            statement.setString(2, "Niharika");
            statement.setFloat(3, 30000.0f);
            statement.setString(4, "CSE");
            statement.executeUpdate();
            Statement statement1=conn.createStatement();
            ResultSet resultSet=statement1.executeQuery("select * from employee");
            while(resultSet.next()){
                System.out.println(resultSet.getInt("id")+","+resultSet.getString("name")+","
                +resultSet.getFloat("salary")+" "+resultSet.getString("dept"));
            }
            statement.close();
            statement1.close();
        conn.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
