package com.Tickets.service;

import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Tickets.model.Employer;

@Service
public class EmployerServiceImpl implements EmployerService {
	@Autowired
	private EmailSenderService service;
	@Autowired
	com.Tickets.repository.EmployerRepository EmployerRepository;
	
	@Override
	public Employer saveEmployer(Employer c) {
	
		
		return EmployerRepository.save(c);
	}

	@Override
	public Employer updateEmployer(Employer c) {
		return EmployerRepository.save(c);
	}

	@Override
	public void deleteEmployer(Employer c) {
		EmployerRepository.delete(c);
		
	}

	/*@Override
	public void deleteEmployerById(Long id) {
		EmployerRepository.deleteById(id);
		
	}

	@Override
	public Employer getEmployer(Long id) {
		return EmployerRepository.findById(id).get();
	}
*/
	@Override
	public List<Employer> getAllEmployers() {
		
		return EmployerRepository.findAll();
	}

	@Override
	public Employer getEmployer(String email) {
		// TODO Auto-generated method stub
		return EmployerRepository.findByEmail(email);
	}



}
