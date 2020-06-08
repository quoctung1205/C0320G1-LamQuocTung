package Service;

import model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    void save(Customer customer);
    Customer findById(int ID);
    void update(int ID,Customer customer);
    void remove(int ID);
}
