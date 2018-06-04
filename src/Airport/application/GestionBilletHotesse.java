package Airport.application;

import java.util.Date;

import Airport.domain.Client;
import Airport.domain.Passager;
import Airport.domain.Vol;

public interface GestionBilletHotesse extends GestionBilletClient {

	public void achatBilletClient(Client client);

}
