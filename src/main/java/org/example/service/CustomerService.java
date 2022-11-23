package org.example.service;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.example.data.Customer;
import org.example.data.CustomerRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

import java.util.List;

@Stateless
public class CustomerService {

    @Inject
    private EntityManager entityManager;

    @Inject
    private CustomerRepository repository;

    @PostConstruct
    private void init() {
        // Instantiate Spring Data factory
//        final var factory = new JpaRepositoryFactory(entityManager);
//        // Get an implemetation of PersonRepository from factory
//        this.repository = factory.getRepository(CustomerRepository.class);
    }

    public void save() {
        repository.save(new Customer("Andrew", "Mbata"));
    }

    public List<Customer> findAll() {
        return repository.findAll();
    }
}
