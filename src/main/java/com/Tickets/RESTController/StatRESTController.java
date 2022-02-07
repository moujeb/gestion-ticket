package com.Tickets.RESTController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Tickets.model.Stat;
import com.Tickets.repository.StatRepository;
import com.Tickets.service.StatService;

public class StatRESTController {

	
	@Autowired
	StatService StatService;
	@Autowired
	StatRepository StatRepository;

	@RequestMapping(method=RequestMethod.GET)
	public List<Stat> getAllStats()
	{
		return StatService.getAllStats();
	}
	
	
	
	
	
	@RequestMapping(method = RequestMethod.PUT)
	public Stat updateStat(@RequestBody Stat Stat) {
		System.out.print("update user Stat");
		return StatService.updateStat(Stat);
	}
	

	
	@RequestMapping(method = RequestMethod.POST)
	public Stat createStat(@RequestBody Stat Stat)
	{
		System.out.println("****");
		System.out.println("HELLLLLOOO");
		return StatService.saveStat(Stat);
	}
	
	
}
