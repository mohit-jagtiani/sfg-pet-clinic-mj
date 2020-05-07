package com.example.sfgpetclinicmj.service;

import com.example.sfgpetclinicmj.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long Id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
