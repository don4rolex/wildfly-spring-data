package org.example.data;

import org.springframework.data.repository.ListCrudRepository;

public interface CustomerRepository extends ListCrudRepository<Customer, Long> {
}