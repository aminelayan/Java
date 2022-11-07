package com.dojos_and_ninjas.Services;

import com.dojos_and_ninjas.Models.Ninja;
import com.dojos_and_ninjas.Repositories.ninjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
    private final ninjaRepository ninjaRepository;

    public NinjaService(com.dojos_and_ninjas.Repositories.ninjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<Ninja> allNinjas() {
        return ninjaRepository.findAll();
    }

    public Ninja createNinja(Ninja ninja) {
        return ninjaRepository.save(ninja);
    }

    public Ninja findNinja(Long id) {
        Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
        if (optionalNinja.isPresent()) {
            return optionalNinja.get();
        } else {
            return null;
        }
    }
    public Ninja updateNinja(Ninja ninja){
        return ninjaRepository.save(ninja);
    }
    public void deleteNinja(Long id){
        Ninja ninja=findNinja(id);
        ninjaRepository.delete(ninja);
    }

}
