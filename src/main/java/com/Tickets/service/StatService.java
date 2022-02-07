package com.Tickets.service;

import java.util.List;

import com.Tickets.model.Employer;
import com.Tickets.model.Stat;

public interface StatService {
	Stat saveStat(Stat c);
	Stat updateStat(Stat c);
	List<Stat> getAllStats();
}
