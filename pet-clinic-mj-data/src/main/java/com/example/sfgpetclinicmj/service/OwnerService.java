package com.example.sfgpetclinicmj.service;

import com.example.sfgpetclinicmj.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}

