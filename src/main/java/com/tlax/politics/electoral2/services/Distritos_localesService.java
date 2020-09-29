package com.tlax.politics.electoral2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tlax.politics.electoral2.entities.Distritos_locales;
import com.tlax.politics.electoral2.repositories.Distritos_localesRepository;

@Service
public class Distritos_localesService {
	
	@Autowired
	Distritos_localesRepository DistlocalesRep;
	
	public Distritos_locales savedistlocales(String dist_local_nombre, Long dist_local_numero,
			String dist_local_coordinador, Boolean isactive, Long estado_id) {
		Distritos_locales cl = new Distritos_locales();
		cl.setDist_local_nombre(dist_local_nombre);
		cl.setDist_local_numero(dist_local_numero);
		cl.setDist_local_coordinador(dist_local_coordinador);
		cl.setIsactive(isactive);
		cl.setEstado_id(estado_id);
		
		Distritos_locales newdistlocal = DistlocalesRep.save(cl);
		return newdistlocal;
	}
}
