package br.com.alura.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//COMO CRIAR UM CONTROLER INTEGRADO COM SPRING QUE TEM AS ACTIONS, E COMO USAR A INTERFACE MODEL NO LUGAR DE
// HTTPSERVLETREQUEST QUE É UMA CAMADA DE SERVLETS.

@Controller // Passa ser gerenciada pelo Spring
public class HelloController {
	
// Cada metodo é uma action, o Spring mapeia as requisições para bater no metodos dos controllers
//	@GetMapping("/hello") 
//	public String hello(HttpServletRequest request) { // Podemos usar atributos que serao acessados na VIEW
//		request.setAttribute("nome", "Mundo");       //Nome do atributo e Valor do atributo no Request, 
//												    // Os valores que estao no request podem ser acessados na
//												   // camada de visão "VIEW" pelo Thymeleaf
//		return "hello";
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("nome", "Mundo");
		return "hello";
	}

}
