package br.com.alura.mvc.mudi.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import br.com.alura.mvc.mudi.model.Pedido;

//Passando para o Spring que essa classe é um repositório para criar instâncias quando for solicitado
@Repository 
public class PedidoRepository {

	// A JPA comunica-se com o BD via EntityManager e o HIBERNATE configura com
	// @PersistenceContext
	@PersistenceContext
	private EntityManager entityManager;

	public List<Pedido> recuperaTodosOsPedidos() {

		// Consulta
		Query query = entityManager.createQuery("SELECT p FROM Pedido p", Pedido.class);
		return query.getResultList();

	}

}
