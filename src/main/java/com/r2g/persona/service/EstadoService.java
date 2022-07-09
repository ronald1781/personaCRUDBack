package com.r2g.persona.service;

import java.util.ArrayList;
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

import com.r2g.persona.model.Estado;
import com.r2g.persona.repo.IEstadoRepo;

@Service
public class EstadoService {

	@Autowired
	private IEstadoRepo estadoRepo;

	
	public List<Estado> findAll() {
		// TODO Auto-generated method stub
		return estadoRepo.findAll();
	}

	public List<Estado> findAllByCountry(Long id) {
		List<Estado> estadoRespuesta = new ArrayList<>();
		List<Estado> estados = estadoRepo.findAll();
		for (int i = 0; i < estados.size(); i++) {
			if (estados.get(i).getPais().getId() == id) {
				estadoRespuesta.add(estados.get(i));
			}
		}
		return estadoRespuesta;
	}

	
	public List<Estado> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return estadoRepo.findAll(sort);
	}

	
	public <S extends Estado> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return estadoRepo.count(example);
	}


	public <S extends Estado> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return estadoRepo.exists(example);
	}

	
}
