package org.example.dual.primary.repository;

import org.example.dual.primary.model.PrimaryUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimaryUserRepository extends JpaRepository<PrimaryUser, Long> {
}