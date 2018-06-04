package Airport.domain;

import java.util.ArrayList;
import java.util.Collection;

public class Ville {

	public String nom;
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