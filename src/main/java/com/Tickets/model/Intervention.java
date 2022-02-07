package com.Tickets.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Intervention {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String Adresse;
	private String tempt;
	private String bugete;
	private String actions;
	private String commentaire;
	public Intervention(long id, com.Tickets.model.Ticket ticket) {
		super();
		this.id = id;
		Ticket = ticket;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String Adresse) {
		this.Adresse = Adresse;
	}
	
	
	public String getTempt() {
		return tempt;
	}
	public void setTemp(String tempt) {
		this.tempt = tempt;
	}
	
	
	public String getBugete() {
		return bugete;
	}

	public void SetBugete(String bugete) {
		this.bugete = bugete;
	}
	
	public String getactions() {
		return actions;
	}
	public void setactins(String actions) {
		this.actions = actions;
	}
	
	
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String Commentaire) {
		this.commentaire = commentaire;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Ticket getTicket() {
		return Ticket;
	}
	public void setTicket(Ticket ticket) {
		Ticket = ticket;
	}
	@ManyToOne
	private Ticket Ticket;
}
