package com.dojos_and_ninjas.Services;

import com.dojos_and_ninjas.Models.Dojo;
import com.dojos_and_ninjas.Repositories.dojoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DojoService {
    private final dojoRepository dojoRepository;

    public DojoService(com.dojos_and_ninjas.Repositories.dojoRepository dojoRepository) {
        this.dojoRepository = dojoRepository;
    }
    public List<Dojo> allDojos(){
        return dojoRepository.findAll();
    }
    public Dojo createDojo(Dojo dojo){
        return dojoRepository.save(dojo);
    }
    public Dojo findDojo(Long id){
        Optional<Dojo> optionalDojo =dojoRepository.findById(id);
        if (optionalDojo.isPresent()){
            return optionalDojo.get();
        }else{
            return null;
        }
    }
    public Dojo updateDojo(Dojo dojo){
        return dojoRepository.save(dojo);
    }
    public void deleteDojo(Long id){
        Dojo dojo=findDojo(id);
        dojoRepository.delete(dojo);
    }

}
