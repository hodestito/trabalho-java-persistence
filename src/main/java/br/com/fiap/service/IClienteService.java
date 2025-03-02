package main.java.br.com.fiap.service;

import java.util.List;

import main.java.br.com.fiap.entity.Cliente;

public interface IClienteService {

	List<Cliente> getAllClientes();
	
	Cliente getClienteById(long id);

	Cliente addCliente(Cliente cliente);

	Cliente updateCliente(Cliente cliente);

	void deleteCliente(long id);
}
