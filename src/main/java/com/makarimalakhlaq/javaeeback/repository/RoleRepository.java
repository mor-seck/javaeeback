package com.makarimalakhlaq.javaeeback.repository;

import com.makarimalakhlaq.javaeeback.model.Role;
import com.makarimalakhlaq.javaeeback.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
