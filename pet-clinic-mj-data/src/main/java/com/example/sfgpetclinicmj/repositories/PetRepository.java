package com.example.sfgpetclinicmj.repositories;

import com.example.sfgpetclinicmj.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
