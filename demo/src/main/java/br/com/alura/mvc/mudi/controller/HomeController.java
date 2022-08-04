package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller // Passo para o Spring que este é o controller
public class HomeController {

	@GetMapping("/home") // Anotação para mapear solicitações HTTP GET em métodos manipuladores
							// específicos.
	public String home(Model model) { // Passando valores para VIEW com interface MODEL

		// Criando o pedido
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Xiaomi Redmi Note 8");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/51wgmCYDFML._AC_SL1000_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Celular-Xiaomi-Vers%C3%A3o-Global-Space/dp/B07Y9ZHLXW?th=1");
		pedido.setDescricao("Produto novo");

		List<Pedido> pedidos = Arrays.asList(pedido); // Lista de pedidos
		model.addAttribute("pedidos", pedidos); // Mandando informaçoes para VIEW
		return "home"; // Metodo String que retorna o nome da VIEW
	}

}
