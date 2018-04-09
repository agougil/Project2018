package Model;

import org.hibernate.annotations.Entity;

@Entity
public class Article {

	public Article() {
		@Id
		String id_Article 
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
		
		
	}

}
