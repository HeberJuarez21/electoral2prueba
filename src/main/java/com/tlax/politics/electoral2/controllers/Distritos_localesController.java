package com.tlax.politics.electoral2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tlax.politics.electoral2.entities.Distritos_locales;
import com.tlax.politics.electoral2.services.Distritos_localesService;

@RestController
public class Distritos_localesController {
	
	@Autowired
	Distritos_localesService serv;
	
	@GetMapping(value = "DistLocal/save", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	 public Distritos_locales save (
			 @RequestParam(name = "dist_local_nombre") String dist_local_nombre,
			 @RequestParam(name = "dist_local_numero") Long dist_local_numero,
			 @RequestParam(name = "dist_local_coordinador") String dist_local_coordinador,
			 @RequestParam(name = "isactive") Boolean isactive,
			 @RequestParam(name = "estado_id") Long estado_id) {
		return serv.savedistlocales(dist_local_nombre, dist_local_numero, dist_local_coordinador, isactive, estado_id);
	 }
}
