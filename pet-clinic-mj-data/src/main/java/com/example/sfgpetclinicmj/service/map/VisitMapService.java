package com.example.sfgpetclinicmj.service.map;

import com.example.sfgpetclinicmj.model.Visit;
import com.example.sfgpetclinicmj.service.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
// @Profile({"default", "map"})
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
            return super.findById(id);
    }

    @Override
    public Visit save(Visit visit) {
        if(visit.getPet() == null || visit.getPet().getOwner() ==null ||
        visit.getPet().getId() == null || visit.getPet().getOwner().getId() == null){
            throw new RuntimeException("Pet is required");
        }
        return super.save(visit);
    }

    @Override
    public void delete(Visit visit) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
