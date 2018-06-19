package epsi.design_patterns.Airport.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import epsi.design_patterns.Airport.application.GestionBilletClient;
import epsi.design_patterns.Airport.application.GestionClient;

@Entity
public class Hotesse {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nom;
	private String prenom;
	
	@OneToMany(mappedBy="hotesse")
	Collection<Billet> billets = new ArrayList<Billet>();
	@OneToMany(mappedBy="hotesse")
	Collection<Vol1> vols = new ArrayList<Vol1>();
	
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

	public void addBillet(Billet billet)
	{
		billets.add(billet);
		billet.setHotesse(this);
	}

	public Collection<Vol1> getVols() {
		return vols;
	}

	public void setVols(Collection<Vol1> vols) {
		this.vols = vols;
	}

	@Override
	public String toString() {
		return "Hotesse [Nom = " + nom + " ; Prenom = " + prenom + "]";
	}


}
