package Airport.application;

import java.util.Collection;

import Airport.domain.Billet;
import Airport.domain.Vol;

public class GestionVolImplantation implements GestionVol {

	Collection<Billet> billet = (Collection<Billet>) new Billet();

	@Override
	public void ouvrirVol() {
		Vol vol = new Vol();
		vol.setBillets(billet);
		
	}

	@Override
	public void fermerVol() {
		Vol vol = new Vol();
		vol.setBillets(null);
	}
	

}
