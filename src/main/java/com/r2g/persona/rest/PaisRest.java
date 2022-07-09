package com.r2g.persona.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.r2g.persona.model.Pais;
import com.r2g.persona.service.PaisService;

@RestController
@RequestMapping("/paises/")
public class PaisRest {

	@Autowired
	private PaisService paisService;

	@GetMapping
	private ResponseEntity<List<Pais>> getAllPaises() {
		return ResponseEntity.ok(paisService.findAll());
	}

}
