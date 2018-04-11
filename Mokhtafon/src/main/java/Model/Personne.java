package Model;

import org.hibernate.annotations.Entity;

@Entity
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

	public Personne(String nom,String prenom,String email,String addresse,String telephone,String passe,String image,String id_fb,String id_G) {
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

}
