package epsi.design_patterns.Airport.application;

import java.util.Collection;
import java.util.Date;

import epsi.design_patterns.Airport.domain.Aeroport;
import epsi.design_patterns.Airport.domain.Billet;
import epsi.design_patterns.Airport.domain.BilletRepository;
import epsi.design_patterns.Airport.domain.Client;
import epsi.design_patterns.Airport.domain.Hotesse;
import epsi.design_patterns.Airport.domain.Passager;
import epsi.design_patterns.Airport.domain.Vol1;

public class GestionBilletHotesseImplantation implements GestionBilletHotesse{

	Hotesse hotesse = new Hotesse();
	BilletRepository repository;
	
	@Override
	public Billet achatBillet(Date date, int numero, Passager passager, Vol1 vol) {
		Billet billet = repository.findById(numero).get();
		if (billet == null) {
			billet = new Billet();
			repository.save(billet);
		}

		billet.setDate(date);
		billet.setNumero(numero);
		billet.setPassager(passager);
		billet.setVol(vol);
		billet.setClient(null);
		billet.setHotesse(hotesse);
		
		hotesse.addBillet(billet);

		return billet;
	}

	@Override
	public void annulerBillet(Date date, int numero, Passager passager, Vol1 vol) {
		Billet billet = new Billet();
		billet.setDate(null);
		billet.setNumero(0);
		billet.setPassager(null);
		billet.setVol(null);
		billet.setClient(null);
		billet.setHotesse(null);
	}


	@Override
	public Vol1 chercherVol(Date dateDepart, String heureDepart, Date dateArrivee, String heureArrivee,
			Aeroport decoller) {
		Vol1 vol = new Vol1();
		vol.setDateDepart(dateDepart);
		vol.setHeureDepart(heureDepart);
		vol.setDateArrivee(dateArrivee);
		vol.setHeureArrivee(heureArrivee);
		decoller.getDecoller().add(vol);
		return vol;
	}
	
	@Override
	public void achatBilletClient(Client client) {
		// TODO Auto-generated method stub
		
	}

}
