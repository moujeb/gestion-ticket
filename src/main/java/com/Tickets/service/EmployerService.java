package com.Tickets.service;

import java.util.List;

import com.Tickets.model.Employer;




public interface EmployerService {
	Employer saveEmployer(Employer c);
	Employer updateEmployer(Employer c);
	void deleteEmployer(Employer c);
	
	Employer getEmployer(String email);
	List<Employer> getAllEmployers();
}
