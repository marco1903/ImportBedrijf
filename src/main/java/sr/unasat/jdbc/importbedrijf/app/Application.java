package sr.unasat.jdbc.importbedrijf.app;

import sr.unasat.jdbc.importbedrijf.entities.Customer;
import sr.unasat.jdbc.importbedrijf.repositories.CustomerRepository;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        CustomerRepository cr = new CustomerRepository();
        List<Customer> allrecords = cr.findAllRecords();
        for (Customer customer : allrecords) {
            System.out.println(customer);

        }
    }
}
