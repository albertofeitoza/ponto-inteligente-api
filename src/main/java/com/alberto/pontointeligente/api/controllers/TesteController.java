package com.alberto.pontointeligente.api.controllers;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/teste")
@CrossOrigin(origins = "*")

public class TesteController {
	
	@GetMapping(value="/{nome}")
     public String teste(@PathVariable("nome")String nome) {
		return "Olá" + nome;
	}
}
