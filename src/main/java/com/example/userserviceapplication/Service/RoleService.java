package com.example.userserviceapplication.Service;

import com.example.userserviceapplication.Models.Role;
import com.example.userserviceapplication.Repositories.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service

public class RoleService {
    RoleRepository roleRepository;
    public RoleService() {
    }
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role createRole(String name) {
        Role role = new Role();
        role.setRole(name);

        return roleRepository.save(role);
    }
}
