package com.objetivos.obj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class objetivosController {
	
	@GetMapping
	public String objetivos_aprendizagem () {
		
		
		return "Introdução a Rest\nMétodos e Status Http\nCamadas\nHello World";
		
	}
}
