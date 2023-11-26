package com.example.userserviceapplication.Repositories;

import com.example.userserviceapplication.Models.Role;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface RoleRepository extends JpaRepository<Role, Long> {


    List<Role> findAllByIdIn(List<Long> roleIds);
}
