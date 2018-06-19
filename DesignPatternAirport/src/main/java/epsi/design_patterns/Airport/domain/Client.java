package epsi.design_patterns.Airport.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import epsi.design_patterns.Airport.application.GestionBilletClient;
import epsi.design_patterns.Airport.application.GestionClient;

@Entity
public class Client {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nom;
	private String prenom;
	private String adresse;
	private String telephone;
	private String email;	
	
	@OneToMany(mappedBy="client")
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
	
	public void addBillet(Billet billet)
	{
		billets.add(billet);
		billet.setClient(this);
	}

	@Override
	public String toString() {
		return "Client [Nom = " + nom + " ; Prenom = " + prenom + " ; Adresse = " + adresse + " ; Téléphone = " + telephone + "]";
	}

}
