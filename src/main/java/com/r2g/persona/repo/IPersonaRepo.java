package com.r2g.persona.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.r2g.persona.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Long> {

}
