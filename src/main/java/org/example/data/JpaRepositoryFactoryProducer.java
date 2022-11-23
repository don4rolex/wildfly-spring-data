package org.example.data;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

@ApplicationScoped
public class JpaRepositoryFactoryProducer {

    private final EntityManager entityManager;

    @Inject
    public JpaRepositoryFactoryProducer(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Produces
    public JpaRepositoryFactory jpaRepositoryFactory() {
        return new JpaRepositoryFactory(entityManager);
    }
}
