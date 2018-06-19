package epsi.design_patterns.Airport.application;

import epsi.design_patterns.Airport.domain.Client;

public class GestionClientImplantation implements GestionClient {

	@Override
	public void enregistrementClient(String nom, String prenom, String adresse, String telephone) {
		Client client = new Client();
		client.setNom(nom);
		client.setPrenom(prenom);
		client.setAdresse(adresse);
		client.setTelephone(telephone);
	}

}
