package cardealership;

import java.sql.*;

public class CarMethods implements CarMethodsInterface{
    public int carCount(){
        int num=0;
        try {
            Connection con=DBConnection.getConnection();
            Statement st= con.createStatement();
            ResultSet rs=st.executeQuery("select count(carID) from car");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
