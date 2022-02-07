package com.Tickets.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Tickets.model.Intervention;
import com.Tickets.repository.*;

@Service
public class InterventionServiceImpl implements  InterventionService{

	@Autowired
	private EmailSenderService service;
	@Autowired
	InterventionRepository InterventionRepository;
	
	@Override
	public Intervention saveIntervention(Intervention c) {
	
	
		return InterventionRepository.save(c);
	}

	@Override
	public Intervention updateIntervention(Intervention c) {
		return InterventionRepository.save(c);
	}

	@Override
	public void deleteIntervention(Intervention c) {
		InterventionRepository.delete(c);
		
	}

	@Override
	public void deleteInterventionById(Long id) {
		InterventionRepository.deleteById(id);
		
	}

	@Override
	public Intervention getIntervention(Long id) {
		return InterventionRepository.findById(id).get();
	}

	@Override
	public List<Intervention> getAllInterventions() {
		
		return InterventionRepository.findAll();
	}

	@Override
	public int NombreByIntervention(Long id) {
		
		return InterventionRepository.NombreByIntervention(id);
	}


	



	


}

