package org.example.data;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

@ApplicationScoped
public class RepositoryCdiConfig {

    private final JpaRepositoryFactory jpaRepositoryFactory;

    @Inject
    public RepositoryCdiConfig(JpaRepositoryFactory jpaRepositoryFactory) {
        this.jpaRepositoryFactory = jpaRepositoryFactory;
    }

    @Produces
    public CustomerRepository customerRepository() {
        return jpaRepositoryFactory.getRepository(CustomerRepository.class);
    }
}
