package com.r2g.persona.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.r2g.persona.model.Pais;
import org.springframework.stereotype.Repository;

@Repository
public interface IPaisRepo extends JpaRepository<Pais, Long> {

}
