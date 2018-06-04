package Airport.domain;

import java.util.ArrayList;
import java.util.Collection;

public class CompagnieAerienne {
	
	public String nom;
	Collection<Vol> vol = new ArrayList<Vol>();
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Collection<Vol> getVol() {
		return vol;
	}
	public void setVol(Collection<Vol> vol) {
		this.vol = vol;
	}

	@Override
	public String toString() {
		return "Compagnie aérienne [Nom = " + nom + "]";
	}
}
