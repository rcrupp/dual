package org.example.dual.primary.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class PrimaryUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    // getters and setters
    // Add constructors, getters, and setters
    public PrimaryUser() {}

    public PrimaryUser(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}