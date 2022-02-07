package com.Tickets.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class contact {
    private String nom;
    private String adresse;
    private String subject;
    private String content;
    private String email;
    private Long id;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }



    public void setAdresse(String Adresse) {
        this.adresse = Adresse;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
