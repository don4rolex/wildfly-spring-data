package org.example.service;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.example.data.Customer;
import org.example.data.CustomerRepository;
import org.example.data.UserAccount;
import org.example.data.UserAccountRepository;

import java.util.List;

@Stateless
public class CustomerService {

    private CustomerRepository customerRepository;
    private UserAccountRepository userAccountRepository;

    public CustomerService() {
    }

    @Inject
    public CustomerService(UserAccountRepository userAccountRepository, CustomerRepository customerRepository) {
        this.userAccountRepository = userAccountRepository;
        this.customerRepository = customerRepository;
        save();
    }

    public void save() {
        customerRepository.save(new Customer("Andrew", "Mbata"));
        userAccountRepository.save(new UserAccount("Andrew", "Mbata"));
    }

    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    public List<UserAccount> findAllUsers() {
        return userAccountRepository.findAll();
    }
}
