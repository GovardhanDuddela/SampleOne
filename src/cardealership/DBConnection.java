package cardealership;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.driver");
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
        Connection con=null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_inventory?autoReconnect=true&useSSL=false","root","Root@123");
            con.setAutoCommit(true);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return con;
    }
}
