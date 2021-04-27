package com.ment_hab.mentHab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MentHab")

public class MentHabController {
	
	@GetMapping
	public String ment_hab() {
		return " Persistência e Atenção aos detalhes!!";
	}

}
