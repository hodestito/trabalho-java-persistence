package main.java.br.com.fiap.repository;

import org.springframework.data.repository.CrudRepository;

import main.java.br.com.fiap.entity.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
