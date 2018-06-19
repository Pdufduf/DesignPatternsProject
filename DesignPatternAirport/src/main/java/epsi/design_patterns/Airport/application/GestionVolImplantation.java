package epsi.design_patterns.Airport.application;

import java.util.Collection;

import epsi.design_patterns.Airport.domain.Billet;
import epsi.design_patterns.Airport.domain.Vol1;

public class GestionVolImplantation implements GestionVol {

	Collection<Billet> billet = (Collection<Billet>) new Billet();

	@Override
	public void ouvrirVol() {
		Vol1 vol = new Vol1();
		vol.setBillets(billet);
		
	}

	@Override
	public void fermerVol() {
		Vol1 vol = new Vol1();
		vol.setBillets(null);
	}
	

}
