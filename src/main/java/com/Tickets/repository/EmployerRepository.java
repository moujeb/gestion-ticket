package com.Tickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.Tickets.model.Client;
import com.Tickets.model.Employer;
@RepositoryRestResource(path = "rest")
public interface EmployerRepository extends JpaRepository<Employer, String>
{
	Employer findByEmail(String email);
}
