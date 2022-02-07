package com.Tickets.service;

import java.util.List;

import com.Tickets.model.Intervention;

public interface InterventionService {

	Intervention saveIntervention(Intervention c);
	int NombreByIntervention(Long id);
	Intervention updateIntervention(Intervention c);
	void deleteIntervention(Intervention c);
	void deleteInterventionById(Long id);
	Intervention getIntervention(Long id);
	List<Intervention> getAllInterventions();
}
