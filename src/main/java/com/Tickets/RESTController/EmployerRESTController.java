package com.Tickets.RESTController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Tickets.model.Employer;
import com.Tickets.model.User;
import com.Tickets.repository.EmployerRepository;
import com.Tickets.service.EmployerService;

@RestController
@RequestMapping("/api/employers")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployerRESTController {
	@Autowired
	EmployerService EmployerService;
	@Autowired
	EmployerRepository EmployerRepository;

	@RequestMapping(method=RequestMethod.GET)
	public List<Employer> getAllEmployers()
	{
		return EmployerService.getAllEmployers();
	}
	
	
	@RequestMapping(value="email/{email}",method = RequestMethod.GET)
	public Employer getEmployerByEmail(@PathVariable("email") String email) {
		return EmployerRepository.findByEmail(email);
	}
	
	
	@RequestMapping(method = RequestMethod.PUT)
	public Employer updateEmployer(@RequestBody Employer Employer) {
		
		System.out.print("update user Employer");
		return EmployerService.updateEmployer(Employer);
	}
	
	
	
	@RequestMapping(method = RequestMethod.POST)
	public Employer createEmployer(@RequestBody Employer Employer)
	{
		Employer.setEnabled(1);
		System.out.println("****");
		System.out.println("HELLLLLOOO");
		return EmployerService.saveEmployer(Employer);
	}
	
	
	

}
