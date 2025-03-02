package main.java.br.com.fiap.test;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import main.java.br.com.fiap.entity.Cliente;
import main.java.br.com.fiap.entity.Endereco;
import main.java.br.com.fiap.entity.Pedido;
import main.java.br.com.fiap.entity.Produto;

public class ClientUtil {
	public void getProdutoByIdDemo(long id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/spring-app/estoque/produto/{id}";
		HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
		ResponseEntity<Produto> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity,
				Produto.class, id);
		Produto produto = responseEntity.getBody();
		System.out.println(produto);
	}

	public void getAllProdutosDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/spring-app/estoque/produtos";
		HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
		ResponseEntity<Produto[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity,
				Produto[].class);
		Produto[] produtos = responseEntity.getBody();
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
	}

	public void addProdutoDemo(Produto objProduto) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/spring-app/estoque/produto";
		HttpEntity<Produto> requestEntity = new HttpEntity<Produto>(objProduto, headers);
		URI uri = restTemplate.postForLocation(url, requestEntity);
		System.out.println(uri.getPath());
	}

	public void updateProdutoDemo(Produto objProduto) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/spring-app/estoque/produto";
		HttpEntity<Produto> requestEntity = new HttpEntity<Produto>(objProduto, headers);
		restTemplate.put(url, requestEntity);

	}

	public void deleteProdutoDemo(long id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/spring-app/estoque/produto/{id}";
		HttpEntity<Produto> requestEntity = new HttpEntity<Produto>(headers);
		restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, Void.class, id);
	}

	public void addClienteDemo(Cliente objCliente) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/spring-app/cliente/cliente";
		HttpEntity<Cliente> requestEntity = new HttpEntity<Cliente>(objCliente, headers);
		URI uri = restTemplate.postForLocation(url, requestEntity);
		System.out.println(uri.getPath());
	}
	
	public static void main(String args[]) {
		ClientUtil util = new ClientUtil();
		List<Pedido> pedidos = new ArrayList<Pedido>();
		Cliente objCliente = new Cliente(1, "Richel", "richelsensineli@gmail.com", new Endereco(1, "Avenida do Estado", "01516-100", "5814", "São Paulo", "SP", "Brasil", new Cliente()), "(11) 975459892",	pedidos);

//		Produto objProduto = new Produto(1, "Notebook", 1.0f, 10);
		util.addClienteDemo(objCliente);
		// objProduto.nome = "Laranja";
		// util.updateProdutoDemo(objProduto);
		// util.deleteProdutoDemo(1);
		// util.getProdutoByIdDemo(1);
		// util.getAllProdutosDemo();
	}
}