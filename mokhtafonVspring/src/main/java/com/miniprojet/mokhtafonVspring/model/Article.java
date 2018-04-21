package com.miniprojet.mokhtafonVspring.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Article {
	@Id
	@GeneratedValue
	String id_Article;
	String Email;
	String nom;
	String prenom;
	String adresse;
	List<String> Url_images;
	String Video_Url;
	String Last_adresse;
	Date Last_view;
	String description;
	Date Date_Ajout;
	String country;
	String city;
	boolean Etat;
	public Article(String Email,String nom,String prenom,String adresse,String video_url,String last_add,Date date_last_view,String description,String country,String city) 
	{
		this.Email=Email;
		this.nom=nom;
		this.prenom=prenom;
		this.adresse=adresse;
		List<String> Url_images;
		this.Video_Url=video_url;
		this.Last_adresse=last_add;
		this.Last_view=date_last_view;
		this.description=description;
		// date ajout au nivau de la base de donnee
		this.country=country;
		this.city=city;
			
		this.Etat=false;
	}
	public String getId_Article() {
		return id_Article;
	}
	public void setId_Article(String id_Article) {
		this.id_Article = id_Article;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public List<String> getUrl_images() {
		return Url_images;
	}
	public void setUrl_images(List<String> url_images) {
		Url_images = url_images;
	}
	public String getVideo_Url() {
		return Video_Url;
	}
	public void setVideo_Url(String video_Url) {
		Video_Url = video_Url;
	}
	public String getLast_adresse() {
		return Last_adresse;
	}
	public void setLast_adresse(String last_adresse) {
		Last_adresse = last_adresse;
	}
	public Date getLast_view() {
		return Last_view;
	}
	public void setLast_view(Date last_view) {
		Last_view = last_view;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate_Ajout() {
		return Date_Ajout;
	}
	public void setDate_Ajout(Date date_Ajout) {
		Date_Ajout = date_Ajout;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isEtat() {
		return Etat;
	}
	public void setEtat(boolean etat) {
		Etat = etat;
	}
	/* DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Date date = new Date();
	Date_Ajout
	*/
	
}
