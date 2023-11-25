package com.example.userserviceapplication.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
@Entity
@Getter
@Setter
public class User extends BaseModel{
    private String Email;
    private String Password;
    @ManyToMany
    private Set<Role> roles = new HashSet<>();
}
