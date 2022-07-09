package com.r2g.persona.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.r2g.persona.model.Persona;
import com.r2g.persona.repo.IPersonaRepo;

@Service
public class PersonaService {

	@Autowired
	private IPersonaRepo personaRepo;


	public List<Persona> findAll() {
		// TODO Auto-generated method stub
		return personaRepo.findAll();
	}

	public <S extends Persona> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return personaRepo.saveAll(entities);
	}


	public <S extends Persona> S save(S entity) {		
		return personaRepo.save(entity);
	}

	public Optional<Persona> findById(Long id) {
		// TODO Auto-generated method stub
		return personaRepo.findById(id);
	}
	public Page<Persona> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return personaRepo.findAll(pageable);
	}

	public void deleteById(Long id) {
		personaRepo.deleteById(id);
		
	}

	public void delete(Persona entity) {
		personaRepo.delete(entity);
		
	}

}
