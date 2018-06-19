package epsi.design_patterns.Airport.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ville {

	@Id
	private String nom;
	@OneToMany(mappedBy="ville", cascade = CascadeType.ALL)
	Collection<Aeroport> areoport = new ArrayList<Aeroport>();
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Collection<Aeroport> getAreoport() {
		return areoport;
	}
	public void setAreoport(Collection<Aeroport> areoport) {
		this.areoport = areoport;
	}

	@Override
	public String toString() {
		return "Ville [Nom = " + nom + "]";
	}
	
}