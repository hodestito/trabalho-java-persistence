package main.java.br.com.fiap.repository;

import org.springframework.data.repository.CrudRepository;

import main.java.br.com.fiap.entity.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long>{

}
