package com.Tickets.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Tickets.model.Stat;
import com.Tickets.repository.*;
public class StatServiceImpl  implements StatService {
	@Autowired
	StatRepository StatRepository;
	@Override
	public Stat saveStat(Stat c) {
		// TODO Auto-generated method stub
		return StatRepository.save(c);
	}

	@Override
	public Stat updateStat(Stat c) {
		// TODO Auto-generated method stub
		return StatRepository.save(c);
	}

	@Override
	public List<Stat> getAllStats() {
		// TODO Auto-generated method stub
		return StatRepository.findAll();
	}

}
