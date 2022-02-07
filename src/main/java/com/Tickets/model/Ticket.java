package com.Tickets.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String status;
	private String propriete;
	private String titre; 
	private String enable;
	private int nbI;


	public Ticket(long id, String status, String propriete, String titre, String enable, int nbI, String categorie,
			Date dateD, Date dateF, String temps, String progression, String contenue, String image, Client client,
			Employer employer) {
		super();
		this.id = id;
		this.status = status;
		this.propriete = propriete;
		this.titre = titre;
		this.enable = enable;
		this.nbI = nbI;
		this.categorie = categorie;
		DateD = dateD;
		DateF = dateF;
		this.temps = temps;
		this.progression = progression;
		Contenue = contenue;
		this.image = image;
		this.client = client;
		this.employer = employer;
	}


	public int getNbI() {
		return nbI;
	}


	public void setNbI(int nbI) {
		this.nbI = nbI;
	}


	public Ticket(long id, String status, String propriete, String titre, String enable, String categorie, Date dateD,
			Date dateF, String temps, String progression, String contenue, String image, Client client) {
		super();
		this.id = id;
		this.status = status;
		this.propriete = propriete;
		this.titre = titre;
		this.enable = enable;
		this.categorie = categorie;
		DateD = dateD;
		DateF = dateF;
		this.temps = temps;
		this.progression = progression;
		Contenue = contenue;
		this.image = image;
		this.client = client;
	}


	public String getEnable() {
		return enable;
	}


	public void setEnable(String enable) {
		this.enable = enable;
	}


	public Ticket(long id, String status, String propriete, String titre, String categorie, Date dateD, Date dateF,
			String temps, String progression, String contenue, String image, Client client) {
		super();
		this.id = id;
		this.status = status;
		this.propriete = propriete;
		this.titre = titre;
		this.categorie = categorie;
		DateD = dateD;
		DateF = dateF;
		this.temps = temps;
		this.progression = progression;
		Contenue = contenue;
		this.image = image;
		this.client = client;
	}


	public String getTitre() {
		return titre;
	}


	public Ticket(long id, String status, String propriete, String titre, String enable, String categorie, Date dateD,
			Date dateF, String temps, String progression, String contenue, String image, Client client,
			Employer employer) {
		super();
		this.id = id;
		this.status = status;
		this.propriete = propriete;
		this.titre = titre;
		this.enable = enable;
		this.categorie = categorie;
		DateD = dateD;
		DateF = dateF;
		this.temps = temps;
		this.progression = progression;
		Contenue = contenue;
		this.image = image;
		this.client = client;
		this.employer = employer;
	}


	public Employer getEmployer() {
		return employer;
	}


	public void setEmployer(Employer employer) {
		this.employer = employer;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	private String categorie;
	private Date DateD;
	private Date DateF;
	private String Datd;
	public String getDatd() {
		return Datd;
	}


	public void setDatd(String datd) {
		Datd = datd;
	}


	public String getDatF() {
		return DatF;
	}


	public void setDatF(String datF) {
		DatF = datF;
	}


	private String DatF;
	private String temps;
	private String progression;
	private String Contenue;	
	@Column(name="image",columnDefinition = "TEXT")
	private  String image;	
	
	
	@ManyToOne
	private Client client;
	@ManyToOne
	private Employer employer;

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getPropriete() {
		return propriete;
	}


	public void setPropriete(String propriete) {
		this.propriete = propriete;
	}


	public String getCategorie() {
		return categorie;
	}


	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}


	public Date getDateD() {
		return DateD;
	}


	public void setDateD(Date dateD) {
		DateD = dateD;
	}


	public Date getDateF() {
		return DateF;
	}


	public void setDateF(Date dateF) {
		DateF = dateF;
	}


	public String getTemps() {
		return temps;
	}


	public void setTemps(String temps) {
		this.temps = temps;
	}


	public String getProgression() {
		return progression;
	}


	public void setProgression(String progression) {
		this.progression = progression;
	}


	public String getContenue() {
		return Contenue;
	}


	public void setContenue(String contenue) {
		Contenue = contenue;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public Ticket(long id, String status, String propriete, String categorie, Date dateD, Date dateF, String temps,
			String progression, String contenue, String image, Client client) {
		super();
		this.id = id;
		this.status = status;
		this.propriete = propriete;
		this.categorie = categorie;
		DateD = dateD;
		DateF = dateF;
		this.temps = temps;
		this.progression = progression;
		Contenue = contenue;
		this.image = image;
		this.client = client;
	}


	public Ticket() {
		super();
	}
	
}
