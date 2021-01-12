package com.example.testLibMgmt;

import com.example.testLibMgmt.books.Books;
import com.example.testLibMgmt.books.BooksRepository;
import com.example.testLibMgmt.customer.Customer;
import com.example.testLibMgmt.customer.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestLibMgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestLibMgmtApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository, BooksRepository booksRepository) {
		return args -> {
			Customer andi = new Customer(
					"Ajazi",
					"Andi",
					"andiajazi@outlook.com"
			);
			customerRepository.save(andi);

			Books book1 = new Books(
					"Keshtjella",
					"9781234567897"
			);
			booksRepository.save(book1);
		};
	}
}
