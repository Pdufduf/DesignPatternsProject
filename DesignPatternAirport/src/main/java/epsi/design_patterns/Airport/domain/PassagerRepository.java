package epsi.design_patterns.Airport.domain;

import org.springframework.data.repository.CrudRepository;

public interface PassagerRepository extends CrudRepository<Passager, Integer> {


	public Passager findByNom(String nom);
}
