package com.example.CustomQueries;

import com.example.CustomQueries.Persistence.Repo.PersonRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class CustomQueriesApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(CustomQueriesApplication.class, args);

		PersonRepo repo = ac.getBean(PersonRepo.class);
		System.out.println(repo.findAllJPQL());
		System.out.println(repo.findAllSQL());
		System.out.println(repo.findPersonByName("Will"));
		System.out.println(repo.findPersonByNameAndAge("Eric", 22));
		System.out.println(repo.findPersonByAgeGreaterThan(1));
		System.out.println(repo.findPersonByAgeLessThan(47));
		System.out.println(repo.findPersonByNameIsNull());
		System.out.println(repo.findPersonByNameIsNotNull());
		System.out.println(repo.findPersonByNameSQL("Will"));
		System.out.println(repo.findPersonByNameAndAgeSQL("Eric", 22));
	}

}
