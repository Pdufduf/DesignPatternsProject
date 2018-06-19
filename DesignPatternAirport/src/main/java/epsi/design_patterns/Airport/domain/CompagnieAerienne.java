package epsi.design_patterns.Airport.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CompagnieAerienne {
	
	@Id
	private String nom;
	@OneToMany(mappedBy="compagnie")
	Collection<Vol1> vol = new ArrayList<Vol1>();
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Collection<Vol1> getVol() {
		return vol;
	}
	public void setVol(Collection<Vol1> vol) {
		this.vol = vol;
	}

	@Override
	public String toString() {
		return "Compagnie aérienne [Nom = " + nom + "]";
	}
}
