package main.java.br.com.fiap.service;

import java.util.List;
import main.java.br.com.fiap.entity.Produto;

public interface IProdutoService {

	List<Produto> getAllProdutos();

	Produto getProdutoById(long id);

	Produto addProduto(Produto produto);

	Produto updateProduto(Produto produto);

	void deleteProduto(long id);
}