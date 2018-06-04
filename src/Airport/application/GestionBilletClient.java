package Airport.application;

import java.util.Date;

import Airport.domain.Aeroport;
import Airport.domain.Client;
import Airport.domain.Hotesse;
import Airport.domain.Passager;
import Airport.domain.Vol;

public interface GestionBilletClient {

	public void achatBillet(Date date, int numero, Passager passager, Vol vol);
	public void annulerBillet(Date date, int numero, Passager passager, Vol vol);
	public Vol chercherVol(Date dateDepart, String heureDepart, Date dateArrivee, String heureArrivee, Aeroport decoller, Aeroport aterrir);
}
