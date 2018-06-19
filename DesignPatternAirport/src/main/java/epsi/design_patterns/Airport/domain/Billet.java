package epsi.design_patterns.Airport.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Billet {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int numero;
	private Date date;
	
	@ManyToOne
	private Passager passager;
	@ManyToOne
	private Vol1 vol;
	@ManyToOne
	private Client client;
	@ManyToOne
	private Hotesse hotesse;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Passager getPassager() {
		return passager;
	}

	public void setPassager(Passager passager) {
		this.passager = passager;
	}
	
	public Vol1 getVol() {
		return vol;
	}

	public void setVol(Vol1 vol) {
		this.vol = vol;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public Hotesse getHotesse() {
		return hotesse;
	}

	public void setHotesse(Hotesse hotesse) {
		this.hotesse = hotesse;
	}
	
	@Override
	public String toString() {
		return "Billet [Numéro = " + numero + " ; Date = " + date + " ; Passager = " + passager + " ; Vol = " + vol + "]";
	}
}
