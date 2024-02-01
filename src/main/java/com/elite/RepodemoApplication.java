package com.elite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.elite.model.Product;
import com.elite.repo.ProductRepository;

@SpringBootApplication
public class RepodemoApplication implements CommandLineRunner {

	
	@Autowired
	private ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(RepodemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Product produit=new Product(0,"laptop toshiba i5", 2300, "Pc performant");
		productRepository.save(produit);
		
		
	}

}
