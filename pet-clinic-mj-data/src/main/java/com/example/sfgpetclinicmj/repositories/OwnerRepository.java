package com.example.sfgpetclinicmj.repositories;

import com.example.sfgpetclinicmj.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
