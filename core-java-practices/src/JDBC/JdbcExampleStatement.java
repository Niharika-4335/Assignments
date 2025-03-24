package JDBC;

import java.sql.*;

public class JdbcExampleStatement {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employee", "root", "root");
            CallableStatement statement = conn.prepareCall("{call display_data(?)}");
            //in parameter in callable statement.
//            statement.setFloat(1, 30000f);
//            ResultSet resultSet=statement.executeQuery();
//            while(resultSet.next()){
//                System.out.println(resultSet.getFloat(1));
//            }
            statement.registerOutParameter(1, java.sql.Types.FLOAT);
            statement.execute();
            float result = statement.getFloat(1);//for out parameters we have to actually register it.
            System.out.println(result);
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
