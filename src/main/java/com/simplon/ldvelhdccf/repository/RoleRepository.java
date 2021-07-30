package com.simplon.ldvelhdccf.repository;

import java.util.Optional;

import com.simplon.ldvelhdccf.model.ERole;
import com.simplon.ldvelhdccf.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
