package Model;

import org.hibernate.annotations.Entity;

@Entity
public class Personne {

	public Personne() {

		String nom;
		String prenom;
		@Id
		String email;
		String adresse;
		List<String> telephones;
		String image;
		String passe;
		Date first_visit;
		Date last_visit;
		String Id_Facebook;
		String Id_Google;

	}

}
