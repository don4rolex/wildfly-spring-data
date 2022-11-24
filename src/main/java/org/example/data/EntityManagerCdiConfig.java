package org.example.data;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@ApplicationScoped
public class EntityManagerCdiConfig {

    @Produces
    @PersistenceContext
    private EntityManager entityManager;
}