package com.example.sfgpetclinicmj.service.springdatajpa;

import com.example.sfgpetclinicmj.model.PetType;
import com.example.sfgpetclinicmj.repositories.PetTypeRepository;
import com.example.sfgpetclinicmj.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeSDJpaService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        return (Set<PetType>) petTypeRepository.findAll();
    }

    @Override
    public PetType findById(Long aLong) {
        return petTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public void delete(PetType object) {
        petTypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepository.deleteById(aLong);
    }
}
