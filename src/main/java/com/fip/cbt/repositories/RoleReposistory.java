package com.fip.cbt.repositories;

import com.fip.cbt.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface RoleReposistory extends MongoRepository<Role, Long> {

    @Query("{Role:'?0'}")
    Role findByName(String name);
}
