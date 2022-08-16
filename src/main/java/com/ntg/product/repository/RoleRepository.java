package com.ntg.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ntg.product.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  public Role findByName(String name);
}
