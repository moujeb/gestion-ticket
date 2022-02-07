package com.Tickets.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Employer extends User{

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String email;
	private int nbFermer;
	private int nbOuvert;

	public int getNbFermer() {
		return nbFermer;
	}
	public void setNbFermer(int nbFermer) {
		this.nbFermer = nbFermer;
	}
	public Employer(String email, int numtel, String nom, String prenom, String role, String password, int enabled,
			String image) {
		super(email, numtel, nom, prenom, role, password, enabled, image);
	}
	public Employer(String email, int numtel, String nom, String prenom, String role, String password, int enabled,
			String image, String email2, int nbFermer, int nbOuvert, List<Ticket> tickets) {
		super(email, numtel, nom, prenom, role, password, enabled, image);
		email = email2;
		this.nbFermer = nbFermer;
		this.nbOuvert = nbOuvert;
		this.tickets = tickets;
	}
	public int getNbOuvert() {
		return nbOuvert;
	}
	public void setNbOuvert(int nbOuvert) {
		this.nbOuvert = nbOuvert;
	}
	@OneToMany(mappedBy = "employer")
	@JsonIgnore
	private List<Ticket> tickets;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Ticket> getTickets() {
		return tickets;
	}
	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
	public Employer() {
		super();
		// TODO Auto-generated constructor stub
	}
}
