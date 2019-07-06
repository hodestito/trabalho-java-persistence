package main.java.br.com.fiap.repository;

import org.springframework.data.repository.CrudRepository;
import main.java.br.com.fiap.entity.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {
}