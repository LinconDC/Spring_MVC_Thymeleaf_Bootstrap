package br.com.alura.mvc.mudi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.repository.PedidoRepository;

@Controller													 // Passo para o Spring que este é o controller
public class HomeController {
	
	@Autowired												 //Injeção de dependência 'Instância de PedidoRepository'
	private PedidoRepository pedidoRespository;
	
	@GetMapping("/home")									 // Anotação para mapear solicitações HTTP GET em métodos manipuladores especificos
	public String home(Model model) {						 // Passando valores para VIEW com interface MODEL
		List<Pedido> pedidos = pedidoRespository.findAll();	//Retorna uma lista com todos pedidos.
		model.addAttribute("pedidos", pedidos);				// Mandando informaçoes para VIEW
		return "home"; 										// Metodo String que retorna o nome da VIEW
	}

}
