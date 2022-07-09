package com.r2g.persona.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.r2g.persona.model.Estado;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstadoRepo extends JpaRepository<Estado, Long> {

}
