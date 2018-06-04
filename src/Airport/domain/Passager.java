package Airport.domain;

import java.util.ArrayList;
import java.util.Collection;

public class Passager {

	public String nom;
	public String prenom;
	
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
	
	public Collection<Billet> getBillets() {
		return billets;
	}

	public void setBillets(Collection<Billet> billets) {
		this.billets = billets;
	}
	
	
	@Override
	public String toString() {
		return "Passager [Nom = " + nom + " Prenom = " + "]";
	}

}
