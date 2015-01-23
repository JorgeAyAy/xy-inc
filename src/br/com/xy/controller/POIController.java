package br.com.xy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class POIController {
	@RequestMapping("/bemVindoSpring")
	public String execute() {
		System.out.println("Executando a lógica com Spring MVC");
		return "bem-vindo";
	}

}
