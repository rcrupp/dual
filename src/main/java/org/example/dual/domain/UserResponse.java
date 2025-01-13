package org.example.dual.domain;

import org.example.dual.primary.model.PrimaryUser;

public class UserResponse {
    private Long id;
    private String name;

    public UserResponse(PrimaryUser user) {
        this.id = user.getId();
        this.name = user.getName();
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
