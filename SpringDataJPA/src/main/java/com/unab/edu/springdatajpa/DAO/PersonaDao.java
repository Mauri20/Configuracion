package com.unab.edu.springdatajpa.DAO;

import org.springframework.data.repository.CrudRepository;

import com.unab.edu.springdatajpa.entidad.Persona;

public interface PersonaDao extends CrudRepository<Persona, Long> {

}
