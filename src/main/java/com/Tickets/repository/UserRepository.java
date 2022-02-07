package com.Tickets.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.Tickets.model.Client;
import com.Tickets.model.Ticket;
import com.Tickets.model.User;

	@RepositoryRestResource(path = "rest")
	public interface UserRepository extends JpaRepository<User, String>
	{

		User findByEmail(String email);
		@Query("select count(*) from User")
	    public int Nombre();
		@Query("select count(*) from User")
	    public int Employer();
		
		 @Query("select h from User h where h.role !='admin' and h.role !='client'")
			List<User> findByRole ();
		 @Query("select h from User h where h.role ='client'")
			List<User> findClients ();
		
		 

	}