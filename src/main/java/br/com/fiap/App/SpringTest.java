package main.java.br.com.fiap.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("main.br.com.fiap")
public class SpringTest {

	public static void main(String[] args) {
		SpringApplication.run(SpringTest.class, args);
	}
}