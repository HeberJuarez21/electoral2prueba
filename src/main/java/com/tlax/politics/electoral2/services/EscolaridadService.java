package com.tlax.politics.electoral2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tlax.politics.electoral2.entities.Escolaridad;
import com.tlax.politics.electoral2.repositories.EscolaridadRepository;

@Service
public class EscolaridadService {
	
	@Autowired
	EscolaridadRepository EscolarRep;
	
	public Escolaridad saveEscolaridad(String escolaridad_name, Boolean isactive) {
		Escolaridad cl = new Escolaridad();
		cl.setEscolaridad_name(escolaridad_name);
		cl.setIsactive(isactive);
		
		Escolaridad newEscolaridad = EscolarRep.save(cl);
		return newEscolaridad;
	}
}
