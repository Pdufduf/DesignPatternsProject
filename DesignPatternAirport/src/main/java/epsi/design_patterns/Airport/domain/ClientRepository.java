package epsi.design_patterns.Airport.domain;

import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Integer> {
	
	public Client findByNom(String nom);
}
