package org.example.esouq.service;
import jakarta.transaction.Transactional;
import org.example.esouq.model.Customer;
import org.example.esouq.repositories.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

// Bechir Ben Zaied
@Service
public class CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    public Customer saveCustomer(Customer customer) {
        return customerDAO.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerDAO.findAll();
    }

    public Optional<Customer> getCustomerById(int id) {
        return customerDAO.getCustomerById(id);  // using custom JPQL query in CustomerDAO
    }

    public List<Customer> getCustomersByEmail(String email) {
        return customerDAO.findCustomerByEmailByEmailContaining(email);
    }

    @Transactional
    public void deleteCustomerById(int id) {
        customerDAO.deleteById(id);
    }

    @Transactional
    public Customer updateById(int id, Customer customerToUpdate) {
        int rowsUpdated = customerDAO.updateCustomerById(
                id,
                customerToUpdate.getFirstName(),
                customerToUpdate.getLastName(),
                customerToUpdate.getEmail()
        );

        if (rowsUpdated > 0) {
            return customerDAO.findById(id).orElse(null);
        } else {
            throw new RuntimeException("Customer not found with id: " + id);
        }
    }
}