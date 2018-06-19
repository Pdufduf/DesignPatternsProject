package epsi.design_patterns.Airport.application;

import java.util.Date;

import epsi.design_patterns.Airport.domain.Aeroport;
import epsi.design_patterns.Airport.domain.Billet;
import epsi.design_patterns.Airport.domain.Client;
import epsi.design_patterns.Airport.domain.Hotesse;
import epsi.design_patterns.Airport.domain.Passager;
import epsi.design_patterns.Airport.domain.Vol1;

public interface GestionBilletClient {

	public Billet achatBillet(Date date, int numero, Passager passager, Vol1 vol);
	public void annulerBillet(Date date, int numero, Passager passager, Vol1 vol);
	public Vol1 chercherVol(Date dateDepart, String heureDepart, Date dateArrivee, String heureArrivee, Aeroport decoller);
}
