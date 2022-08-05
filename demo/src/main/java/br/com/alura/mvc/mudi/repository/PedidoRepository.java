package br.com.alura.mvc.mudi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.alura.mvc.mudi.model.Pedido;

//Passando para o Spring que essa classe é um repositório para criar instâncias quando for solicitado
@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
