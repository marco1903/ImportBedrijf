package sr.unasat.jdbc.importbedrijf.repositories;

import sr.unasat.jdbc.importbedrijf.entities.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private Connection connection;

    public CustomerRepository() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver registered!");

            String URL = "jdbc:mysql://localhost/importbedrijf";
            String USER = "root";
            String PASS = "123456";
            connection = DriverManager.getConnection(URL, USER, PASS);
            System.out.println(connection);


        } catch (ClassNotFoundException ex) {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public List<Customer> findAllRecords() {
        List<Customer> customerList = new ArrayList();
        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            String sql = " select * from customer ";
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("");

            while (rs.next()) {
                //Retrieve by column name
                int customer_ID = rs.getInt("Customer_ID");
                String first_Name = rs.getString("First_Name");
                String last_Name = rs.getString("Last_Name");
                String street_Name = rs.getString("Street_Name");
                int house_Number = rs.getInt("House_Number");
                String identification_Number = rs.getString("Identification_Number");
                String mobile_Number = rs.getString("Mobile_Number");
                customerList.add(new Customer(customer_ID, first_Name, last_Name, street_Name, house_Number, identification_Number, mobile_Number ));
            }
            rs.close();
        } catch (SQLException e) {

        } finally {

        }
        return customerList;
    }
}
