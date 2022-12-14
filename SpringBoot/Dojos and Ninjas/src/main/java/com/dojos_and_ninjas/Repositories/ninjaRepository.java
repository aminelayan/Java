package com.dojos_and_ninjas.Repositories;

import com.dojos_and_ninjas.Models.Ninja;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ninjaRepository extends CrudRepository<Ninja,Long> {
List<Ninja> findAll();
List<Ninja> findNinjaById(Long id);
}
