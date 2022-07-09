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

import com.r2g.persona.model.Pais;
import com.r2g.persona.repo.IPaisRepo;

@Service
public class PaisService {

	@Autowired
	private IPaisRepo paisRepo;

	
	public List<Pais> findAll() {
		// TODO Auto-generated method stub
		return paisRepo.findAll();
	}


}
