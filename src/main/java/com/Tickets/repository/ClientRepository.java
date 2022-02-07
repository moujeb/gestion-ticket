package com.Tickets.repository;



	import java.util.List;


import com.Tickets.model.Client;

import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.data.jpa.repository.Query;
	import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
	@RepositoryRestResource(path = "rest")
	public interface ClientRepository extends JpaRepository<Client, Long>
	{

		Client findByEmail(String email);
		
		
		@Query("select count(*) from Client")
	    public int Nombre();


	}