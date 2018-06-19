package epsi.design_patterns.Airport.domain;

import org.springframework.data.repository.CrudRepository;

public interface HotesseRepository extends CrudRepository<Hotesse, Integer> {


	public Hotesse findByNom(String nom);
}
