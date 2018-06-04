package Airport.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import Airport.application.GestionBilletClient;
import Airport.application.GestionClient;

public class Client {

	public String nom;
	public String prenom;
	public String adresse;
	public String telephone;
	public String email;	
	
	Collection<Billet> billets = new ArrayList<Billet>();
	
	
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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Collection<Billet> getBillets() {
		return billets;
	}

	public void setBillets(Collection<Billet> billets) {
		this.billets = billets;
	}

	@Override
	public String toString() {
		return "Client [Nom = " + nom + " Prenom = " + prenom + " Adresse = " + adresse + " Téléphone = " + telephone + "]";
	}

}
