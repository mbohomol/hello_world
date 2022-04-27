package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Hello World!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "Comunicação <br /> Persistencia <br /> Pro Atividade <br /> Orientação ao Detalhe <br /> Responsabilidade Pessoal, <br /> ";
		
	}
	
	@GetMapping("/objetivo")
	public String objetivo() {
		return "Aprender a usar o SpringBoot <br /> Revisar conceitos do MYSQL <br /> Revisar conceitos de Java";
	}



}
