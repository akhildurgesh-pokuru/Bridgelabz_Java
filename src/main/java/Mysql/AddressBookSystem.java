package Mysql;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

import static java.lang.Class.forName;

public class AddressBookSystem {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/AddressBookService";
        String username = "root";
        String pass = "Vishruth45";

        //String query = "create database IF NOT EXISTS AddressBookService";
        //String query1 = "use AddressBookService";
//        String query = "create table AddressBooks(" +
//                "First varchar(20), " +
//                "LastName varchar(20)," +
//                "Address varchar(30)," +
//                "City varchar(20)," +
//                "State varchar(30)," +
//                "ZipCode int," +
//                "PhoneNumber int," +
//                "Email varchar(20))";



//        String query = "insert into AddressBooks\n" +
//                "VALUES\n" +
//                "(\"Pokuru\",\"Akhil Durgesh\",\"Kadapa, Andhra Pradesh\",\"Kadapa\",\"Andhra Pradesh\",603203,79933,\"akhil@gmail.com\"),\n" +
//                "(\"Kokatam\",\"charan\",\"Kadapa, Andhra Pradesh\",\"Kadapa\",\"Andhra Pradesh\",603203,70133,\"charan@gmail.com\"),\n" +
//                "(\"kantla\",\"Avinash\",\"Hyderbad, Telengana\",\"Hyderbad\",\"Telengana\",524232,32895,\"avinash@gmail.com\");";

        //String query = "update AddressBooks set PhoneNumber = 7893060 where LastName = \"Akhil Durgesh\"";
        // String query = "delete from AddressBooks where First = \"Kantla\"";
        //String query = "select * from AddressBooks where State = \"Andhra Pradesh\"";
        String query = "select State, count(First) from AddressBooks GROUP BY State";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, pass);

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            while(rs.next()){
                System.out.print(rs.getString("First"));
                System.out.print(" ");
                System.out.print(rs.getString("LastName"));
                System.out.print(" ");
                System.out.print(rs.getString("Address"));
                System.out.print(" ");
                System.out.print(rs.getString("Address"));
                System.out.print(" ");
                System.out.print(rs.getString("City"));
                System.out.print(" ");
                System.out.print(rs.getString("State"));
                System.out.print(" ");
                System.out.print(rs.getInt("ZipCode"));
                System.out.print(" ");
                System.out.print(rs.getInt("PhoneNumber"));
                System.out.print(" ");
                System.out.print(rs.getString("Email"));
                System.out.println();
            }

            System.out.println();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


