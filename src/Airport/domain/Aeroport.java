package Airport.domain;

import java.util.ArrayList;
import java.util.Collection;

public class Aeroport {

	public String nom;
	public boolean escale;
	Collection<Vol> decoller = new ArrayList<Vol>();
	Collection<Vol> atterir = new ArrayList<Vol>();
	public Ville ville;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public boolean isEscale() {
		return escale;
	}
	public void setEscale(boolean escale) {
		this.escale = escale;
	}
	public Collection<Vol> getDecoller() {
		return decoller;
	}
	public void setDecoller(Collection<Vol> decoller) {
		this.decoller = decoller;
	}
	public Collection<Vol> getAtterir() {
		return atterir;
	}
	public void setAtterir(Collection<Vol> atterir) {
		this.atterir = atterir;
	}
	
	public Ville getVille() {
		return ville;
	}
	public void setVille(Ville ville) {
		this.ville = ville;
	}
	
	@Override
	public String toString() {
		return "Aéroport [Nom = " + nom + "Ville = " + ville + "]";
	}
	
}
