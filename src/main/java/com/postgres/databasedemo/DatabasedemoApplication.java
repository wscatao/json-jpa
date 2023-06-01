package com.postgres.databasedemo;

import com.postgres.databasedemo.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class DatabasedemoApplication implements CommandLineRunner {

	@Autowired
	private ParentRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DatabasedemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		var parent = new Parent();
//		parent.setName("Willy");
//		parent.setChildren(List.of(new Child("Alice", ChildEnum.FIRST)));
//		parent.setBio(new Bio("bio1"));
//		repository.save(parent);

		var willy = repository.findByName("Willy");
	}
}
