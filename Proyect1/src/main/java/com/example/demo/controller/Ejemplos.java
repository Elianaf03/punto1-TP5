package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ejemplos {		//Peticion sin parametros
	@RequestMapping("/saludo")
	@ResponseBody
	public String saludo( ) {
		return "Programacion Visual";
	}

@RequestMapping("/saludar/{nombre}/{apellido}")		//peticion con parametros
@ResponseBody
public String saludo(@PathVariable("nombre")String nombre, @PathVariable("apellido")String apellido) {
	return "Bienvenido " + nombre + " " + apellido + " a Spring Boot";
}
}
