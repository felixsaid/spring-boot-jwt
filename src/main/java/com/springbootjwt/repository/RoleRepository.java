package com.springbootjwt.repository;

import com.springbootjwt.domain.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
}
