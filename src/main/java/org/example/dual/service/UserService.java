package org.example.dual.service;

import org.example.dual.primary.model.PrimaryUser;
import org.example.dual.primary.repository.PrimaryUserRepository;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final PrimaryUserRepository primaryUserRepo;
    private final JdbcTemplate jdbcTemplate;

    public UserService(PrimaryUserRepository primaryUserRepo, JdbcTemplate secondaryUserTemplate) {
        this.primaryUserRepo = primaryUserRepo;
        this.jdbcTemplate = secondaryUserTemplate;
    }

    public PrimaryUser savePrimaryUser(PrimaryUser user) {
        return primaryUserRepo.save(user);
    }

    public PrimaryUser createUser(String name) {
        try {
            jdbcTemplate.execute("INSERT INTO users (name) VALUES ('" + name + "')");
        } catch (DataAccessException e) {
            throw new RuntimeException(e);
        }
        PrimaryUser primaryUser = new PrimaryUser();
        primaryUser.setName(name);
        return savePrimaryUser(primaryUser);
    }

}
