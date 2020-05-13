package com.example.sfgpetclinicmj.service.springdatajpa;

import com.example.sfgpetclinicmj.model.Vet;
import com.example.sfgpetclinicmj.repositories.VetRepository;
import com.example.sfgpetclinicmj.service.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by jt on 8/5/18.
 */
@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {

    private final VetRepository vetRepository;

    public VetSDJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Vet findByLastName(String lastName) {
        return vetRepository.findByLastName(lastName);
    }

   /* @Override
    public List<Owner> findAllByLastNameLike(String lastName) {
        return ownerRepository.findAllByLastNameLike(lastName);
    } */

    @Override
    public Set<Vet> findAll() {
        return (Set<Vet>) vetRepository.findAll();
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
