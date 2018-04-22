package com.miniprojet.mokhtafonVspring.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Personne")
public class Personne {

	String nom;
	String prenom;
	@Id
	String email;
	String adresse;
	String telephones;
	String image;
	String passe;
	String Id_Facebook;
	String Id_Google;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
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

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephones() {
		return telephones;
	}

	public void setTelephones(String telephones) {
		this.telephones = telephones;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPasse() {
		return passe;
	}

	public void setPasse(String passe) {
		this.passe = passe;
	}

	public String getId_Facebook() {
		return Id_Facebook;
	}

	public void setId_Facebook(String id_Facebook) {
		Id_Facebook = id_Facebook;
	}

	public String getId_Google() {
		return Id_Google;
	}

	public void setId_Google(String id_Google) {
		Id_Google = id_Google;
	}


	public Personne(String nom,String prenom,String email,String addresse,String telephone,String passe,String image,String id_fb,String id_G) 
	{
		this.nom=nom;
		this.prenom=prenom;
		this.email=email;
		this.adresse=addresse;
		this.telephones=telephone;
		this.passe=passe;
		this.Id_Facebook=id_fb;
		this.Id_Google=id_G;
		this.image=image;
		
	}
	
	public Personne(String nom,String prenom,String email,String addresse,String telephone,String passe,String image) 
	{
		this.nom=nom;
		this.prenom=prenom;
		this.email=email;
		this.adresse=addresse;
		this.telephones=telephone;
		this.passe=passe;
		this.Id_Facebook="";
		this.Id_Google="";
		this.image=image;
		
	}
	public Personne(){}

}
