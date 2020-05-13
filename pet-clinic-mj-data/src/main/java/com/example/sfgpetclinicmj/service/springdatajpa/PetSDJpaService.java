package com.example.sfgpetclinicmj.service.springdatajpa;

import com.example.sfgpetclinicmj.model.Pet;
import com.example.sfgpetclinicmj.repositories.PetRepository;
import com.example.sfgpetclinicmj.service.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetService {
    private final PetRepository petRepository;

    public PetSDJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }
    @Override
    public Set<Pet> findAll() {
        return (Set<Pet>) petRepository.findAll();
    }

    @Override
    public Pet findById(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}
