package epsi.design_patterns.Airport.application;

import java.util.Date;

import epsi.design_patterns.Airport.domain.Client;
import epsi.design_patterns.Airport.domain.Passager;

public interface GestionBilletHotesse extends GestionBilletClient {

	public void achatBilletClient(Client client);

}
