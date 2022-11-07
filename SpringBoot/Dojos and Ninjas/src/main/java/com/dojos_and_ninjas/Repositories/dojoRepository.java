package com.dojos_and_ninjas.Repositories;

import com.dojos_and_ninjas.Models.Dojo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface dojoRepository extends CrudRepository<Dojo,Long> {
    List<Dojo> findAll();
}
