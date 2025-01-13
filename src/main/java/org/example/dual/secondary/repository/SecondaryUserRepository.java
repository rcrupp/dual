package org.example.dual.secondary.repository;

import org.example.dual.secondary.model.SecondaryUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondaryUserRepository extends JpaRepository<SecondaryUser, Long> {
}