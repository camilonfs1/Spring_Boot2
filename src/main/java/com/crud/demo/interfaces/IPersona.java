package com.crud.demo.interfaces;

import com.crud.demo.modelo.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersona extends CrudRepository<Persona,Integer> {

}
