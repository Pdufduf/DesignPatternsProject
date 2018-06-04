package Airport.domain;

import java.util.Date;

public class Billet {

	public Date date;
	public int numero;
	
	public Passager passager;
	public Vol vol;
	public Client client;
	public Hotesse hotesse;

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
	
	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
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
		return "Billet [Numéro = " + numero + " Date = " + date + " Passager = " + passager + " Vol = " + vol + "]";
	}
}
