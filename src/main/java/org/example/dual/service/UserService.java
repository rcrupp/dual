package org.example.dual.service;

import org.example.dual.primary.model.PrimaryUser;
import org.example.dual.primary.repository.PrimaryUserRepository;
import org.example.dual.secondary.model.SecondaryUser;
import org.example.dual.secondary.repository.SecondaryUserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final PrimaryUserRepository primaryUserRepo;
    private final SecondaryUserRepository secondaryUserRepo;

    public UserService(PrimaryUserRepository primaryUserRepo, SecondaryUserRepository secondaryUserRepo) {
        this.primaryUserRepo = primaryUserRepo;
        this.secondaryUserRepo = secondaryUserRepo;
    }

    public PrimaryUser savePrimaryUser(PrimaryUser user) {
        return primaryUserRepo.save(user);
    }

    public SecondaryUser saveSecondaryUser(SecondaryUser user) {
        return secondaryUserRepo.save(user);
    }

    public PrimaryUser createUser(String name) {
        SecondaryUser secondaryUser = new SecondaryUser();
        secondaryUser.setName(name);
        saveSecondaryUser(secondaryUser);
        PrimaryUser primaryUser = new PrimaryUser();
        primaryUser.setName(name);
        return savePrimaryUser(primaryUser);
    }

}
