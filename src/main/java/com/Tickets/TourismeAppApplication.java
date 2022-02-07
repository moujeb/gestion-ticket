package com.Tickets;


import javax.mail.MessagingException;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.Tickets.model.Client;



@SpringBootApplication
public class TourismeAppApplication {



	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(TourismeAppApplication.class, args);
	}
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Client.class);
		
		
	}
	
	
}
