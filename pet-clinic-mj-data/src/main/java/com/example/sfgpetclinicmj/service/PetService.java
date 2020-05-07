package com.example.sfgpetclinicmj.service;

import com.example.sfgpetclinicmj.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long Id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
