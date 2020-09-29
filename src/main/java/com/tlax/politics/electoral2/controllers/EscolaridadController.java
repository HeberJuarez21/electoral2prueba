package com.tlax.politics.electoral2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tlax.politics.electoral2.entities.Escolaridad;
import com.tlax.politics.electoral2.services.EscolaridadService;

@RestController
public class EscolaridadController {
	
	@Autowired
	EscolaridadService serv;
	
	@GetMapping(value = "Escolaridad/save", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Escolaridad save (
			@RequestParam(name = "escolaridad_name") String escolaridad_name,
			@RequestParam(name = "isactive") Boolean isactive
			) {
		return serv.saveEscolaridad(escolaridad_name, isactive);
	}	
}
