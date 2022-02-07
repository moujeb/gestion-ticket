package com.Tickets.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stat {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	String email;
	int nbfermer;
	int nbrOuvert;
	int somme;
}
