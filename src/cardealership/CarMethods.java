package cardealership;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarMethods implements CarMethodsInterface{
    @Override
    public boolean carUpdateMake(String carId, String make) {
        int num=0;
        boolean status=false;
        try {
            Connection con=DBConnection.getConnection();
            Statement st=con.createStatement();
            num=st.executeUpdate("update car set carMake='"+make+"' where carID='"+carId+"'");
        } catch (SQLException se) {
            se.printStackTrace();
        }
        if(num==1){
            status=true;
        }else if(num==0) {
            status=false;
        }
        return status;
    }

    @Override
    public boolean carDelete(Car car) {
        int num=0;
        boolean status=false;
        try {
            Connection con=DBConnection.getConnection();
            Statement st= con.createStatement();
            num= st.executeUpdate("delete from car where carID='"+car.getCarId()+"'");
        } catch (SQLException se){
            se.printStackTrace();
        }
        if(num==1){
            status=true;
        }else if(num==0)
            status=false;
        return status;
    }

    @Override
    public boolean carUpdateModel(String carId, String model) {
        int num=0;
        boolean status=false;
        try {
            Connection con=DBConnection.getConnection();
            Statement st=con.createStatement();
            num=st.executeUpdate("update car set carModel='"+model+"' where carID='"+carId+"'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean carUpdateYear(String carId, int year) {
        int num=0;
        boolean status=false;
        try {
            Connection con=DBConnection.getConnection();
            Statement st= con.createStatement();
            num= st.executeUpdate("update car set year='"+year+"' where carID='"+carId+"'");
        } catch (SQLException se) {
            se.printStackTrace();
        }
        if(num==1){
            status=true;
        }else if(num==0) {
            status=false;
        }

        return false;
    }

    @Override
    public boolean carUpdatePrice(String carId, double price) {
        int num=0;
        boolean status=false;
        try{Connection con=DBConnection.getConnection();
            Statement st=con.createStatement();
            num=st.executeUpdate("update car set price='"+price+"' where carID='"+carId+"'");
        }catch(SQLException se) {
            se.printStackTrace();
        }
        if (num==1)
            status=true;
        else if (num==0)
            status=false;
        return status;
    }

    @Override
    public boolean carAdd(Car car) {
        int num = 0;
        boolean status=false;
        try{Connection con=DBConnection.getConnection();
            Statement st=con.createStatement();
            num=st.executeUpdate("insert into car values('"+car.getCarId()+"','"+car.getMake()+"','"+car.getModel()+"',"+car.getYear()+","+car.getPrice()+")");
            con.close();
        }catch(SQLIntegrityConstraintViolationException sqie) {
            System.out.println("The car you are trying to enter already exists");
        }catch(SQLException se) {
            se.printStackTrace();
        }
        if (num==1)
            status=true;
        else if (num==0)
            status=false;
        return status;
    }

    @Override
    public List<Car> carDisplay() {
        List<Car> lda=new ArrayList<Car>();
        Car car;
        Connection con=DBConnection.getConnection();
        try {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from car;");
            while (rs.next()) {
                car=new Car(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getDouble(5));
                lda.add(car);
            }}catch(SQLException e) {
            e.printStackTrace();
        }
        return lda;
    }

    public int carCount(){
        int num=0;
        try {
            Connection con=DBConnection.getConnection();
            Statement st= con.createStatement();
            ResultSet rs=st.executeQuery("select count(carID) from car");
            while (rs.next())
                num=rs.getInt(1);
            con.close();
            return num;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return num;
    }

}
