package com.example.sfgpetclinicmj.repositories;

import com.example.sfgpetclinicmj.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);

    List<Owner> findByLastNameLike(String lastName);
}
