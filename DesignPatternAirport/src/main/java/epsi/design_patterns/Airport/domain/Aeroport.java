package epsi.design_patterns.Airport.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlEnum;

@Entity
public class Aeroport {

	@Id
	private String nom;
	private boolean escale;
	@OneToMany(mappedBy="decoller")
	Collection<Vol1> decoller = new ArrayList<Vol1>();
	
	//Collection<Vol> atterir = new ArrayList<Vol>();
	@ManyToOne
	private Ville ville;
	
	public Aeroport(String nom, boolean escale, Ville ville) {
		super();
		this.nom = nom;
		this.escale = escale;
		//this.atterir = atterir;
		this.ville = ville;
		ville.getAreoport().add(this);
	}
	public Aeroport() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public Collection<Vol1> getDecoller() {
		return decoller;
	}
	public void setDecoller(Collection<Vol1> decoller) {
		this.decoller = decoller;
	}
	/*public Collection<Vol> getAtterir() {
		return atterir;
	}
	public void setAtterir(Collection<Vol> atterir) {
		this.atterir = atterir;
	}*/
	public Ville getVille() {
		return ville;
	}
	public void setVille(Ville ville) {
		this.ville = ville;
	}
	
	@Override
	public String toString() {
		return "Aéroport [Nom = " + nom + " ; " + ville + "]";
	}
	
}
