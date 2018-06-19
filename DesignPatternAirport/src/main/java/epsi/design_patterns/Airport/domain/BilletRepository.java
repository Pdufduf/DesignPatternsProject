package epsi.design_patterns.Airport.domain;

import org.springframework.data.repository.CrudRepository;

public interface BilletRepository extends CrudRepository<Billet, Integer> {
	
}
