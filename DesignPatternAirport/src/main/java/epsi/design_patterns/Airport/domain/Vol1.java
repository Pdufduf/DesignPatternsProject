package epsi.design_patterns.Airport.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Vol1 {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private Date dateDepart;	
	private String heureDepart;
	private Date dateArrivee;
	private String heureArrivee;

	@OneToMany(mappedBy="vol")
	Collection<Billet> billets = new ArrayList<Billet>();
	@ManyToOne
	Hotesse hotesse;
	@ManyToOne
	Aeroport decoller;
	@ManyToOne
	public CompagnieAerienne compagnie;
	
	public Collection<Billet> getBillets() {
		return billets;
	}

	public void setBillets(Collection<Billet> billets) {
		this.billets = billets;
	}

	public Hotesse getHotesse() {
		return hotesse;
	}

	public void setHotesse(Hotesse hotesse) {
		this.hotesse = hotesse;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public String getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(String heureDepart) {
		this.heureDepart = heureDepart;
	}

	public Date getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public String getHeureArrivee() {
		return heureArrivee;
	}

	public void setHeureArrivee(String heureArrivee) {
		this.heureArrivee = heureArrivee;
	}

	public Aeroport getDecoller() {
		return decoller;
	}

	public void setDecoller(Aeroport decoller) {
		this.decoller = decoller;
	}

	public CompagnieAerienne getCompagnie() {
		return compagnie;
	}

	public void setCompagnie(CompagnieAerienne compagnie) {
		this.compagnie = compagnie;
	}


	@Override
	public String toString() {
		return "Vol [Date de départ / Heure de départ = " + dateDepart + " / " + heureDepart + " Date d'arrivée / Heure d'arrivée = " + dateArrivee + " / " + heureArrivee + " ; Hotesse(s) = " + hotesse + " ; Compagnie aérienne = " + compagnie + " ; Aéroport de départ = " + decoller + " ; Aéroport d'arrivé = " + "]";
	}
	
}
