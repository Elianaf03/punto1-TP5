package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pruebas {
	@RequestMapping("/calcular/{num1}/{num2}")
	public int calcular(@PathVariable("num1") int n1,@PathVariable("num2") int n2) {
		return n1 + n2;
	}
}
