package org.example.data;

import org.springframework.data.repository.ListCrudRepository;

@Repository
public interface UserAccountRepository extends ListCrudRepository<UserAccount, Long> {
}