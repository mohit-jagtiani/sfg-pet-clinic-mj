package com.example.sfgpetclinicmj.repositories;

import com.example.sfgpetclinicmj.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
    Vet findByLastName(String lastName);
}
