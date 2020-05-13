package com.example.sfgpetclinicmj.service;

import com.example.sfgpetclinicmj.model.Vet;

public interface VetService extends CrudService<Vet, Long>{

    Vet findByLastName(String lastName);
}
