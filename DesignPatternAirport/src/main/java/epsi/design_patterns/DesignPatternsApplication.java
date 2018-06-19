package epsi.design_patterns;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import epsi.design_patterns.Airport.application.GestionBilletClient;
import epsi.design_patterns.Airport.application.GestionBilletClientImplantation;
import epsi.design_patterns.Airport.application.GestionClient;
import epsi.design_patterns.Airport.application.GestionClientImplantation;
import epsi.design_patterns.Airport.domain.Aeroport;
import epsi.design_patterns.Airport.domain.AeroportRepository;
import epsi.design_patterns.Airport.domain.Billet;
import epsi.design_patterns.Airport.domain.BilletRepository;
import epsi.design_patterns.Airport.domain.Client;
import epsi.design_patterns.Airport.domain.ClientRepository;
import epsi.design_patterns.Airport.domain.CompagnieAerienneRepository;
import epsi.design_patterns.Airport.domain.Ville;
import epsi.design_patterns.Airport.domain.VilleRepository;
import epsi.design_patterns.Airport.domain.Vol1;
import epsi.design_patterns.Airport.domain.VolRepository;

@SpringBootApplication
public class DesignPatternsApplication {

	@Autowired
	VilleRepository villeRepository;

	private static final Logger log = LoggerFactory.getLogger(DesignPatternsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
	}

	@Bean
	public CommandLineRunner airport1(CompagnieAerienneRepository repository) {
		return (args) -> {

		};
	}

	@Bean
	public CommandLineRunner airport(AeroportRepository repository, VolRepository volRepository,
			ClientRepository clientRepository, BilletRepository billetRepository) {
		return (args) -> {

			Vol1 v1 = new Vol1();
			Aeroport a1 = new Aeroport();
			a1.setNom("Paris");
			a1.getDecoller().add(v1);
			v1.setDecoller(a1);
			repository.save(a1);
			// save a couple of airport

			Ville ville = new Ville();
			ville.setNom("Paris");
			Aeroport roissy = new Aeroport("Roissy CDG", false, ville);
			villeRepository.save(ville);

			Billet billet1 = new Billet();
			Date date1 = new Date(2018 / 8 / 20);
			billet1.setDate(date1);
			billetRepository.save(billet1);

			Client client1 = new Client();
			client1.setNom("DUFAU");
			client1.setPrenom("Poule");
			client1.setEmail("poule.dufau@epsi.fr");
			client1.setAdresse("34 rue d'Une certaine adresse");
			client1.setTelephone("0606060612");
			client1.addBillet(billet1);
			clientRepository.save(client1);

			Billet billet2 = new Billet();
			Date date2 = new Date(2018 / 8 / 20);
			billet2.setDate(date2);
			billetRepository.save(billet2);

			Client client2 = new Client();
			client2.setNom("HOMMEANGE");
			client2.setPrenom("Kante");
			client2.setEmail("kante.hommeange@epsi.fr");
			client2.setAdresse("12 rue d'Une autre certaine adresse");
			client2.setTelephone("0707070712");
			client2.addBillet(billet2);
			clientRepository.save(client2);

			Vol1 v2 = new Vol1();
			Aeroport a2 = new Aeroport();
			a2.setNom("Orly");
			a2.setVille(ville);
			a2.getDecoller().add(v2);
			v2.setDecoller(a2);
			v2.getBillets().add(billet1);
			v2.getBillets().add(billet2);
			billet1.setVol(v2);
			billet2.setVol(v2);
			repository.save(a2);
			volRepository.save(v2);

			GestionBilletClient gestionBillet = new GestionBilletClientImplantation(client1, billetRepository);
			gestionBillet.achatBillet(date1, client1.getId(), null, v2);

			GestionClient gestionClient = new GestionClientImplantation();
			gestionClient.enregistrementClient(client1.getNom(), client1.getPrenom(), client1.getAdresse(),
					client1.getTelephone());

			// fetch all aeroport
			log.info("Aeroport found with findAll():");
			log.info("-------------------------------");
			for (Aeroport aeroport : repository.findAll()) {
				log.info(aeroport.toString());
			}
			log.info("");

			// fetch all vol1
			log.info("Vol1 found with findAll():");
			log.info("-------------------------------");
			for (Vol1 vol1 : volRepository.findAll()) {
				log.info(vol1.toString());
			}
			log.info("");

			// fetch all billet
			log.info("Billet found with findAll():");
			log.info("-------------------------------");
			for (Billet billet : billetRepository.findAll()) {
				log.info(billet.toString());
			}
			log.info("");

			// fetch all Client
			log.info("Client found with findAll():");
			log.info("-------------------------------");
			for (Client client : clientRepository.findAll()) {
				log.info(client.toString());
			}
			log.info("");

			// fetch aeroport by name
			log.info("Aeroport found with findByName('Orly'):");
			log.info("--------------------------------------------");
			repository.findById("Orly").ifPresent(aeroport -> {
				log.info("Aeroport found with findById(Orly):");
				log.info("--------------------------------");
				log.info(aeroport.toString());
				log.info("");
			});
			// for (Aeroport roissy : repository.findByName("Roissy")) {
			// log.info(roissy.toString());
			// }
			log.info("");
		};

	}

}

/*
 * @SpringBootApplication public class DesignPatternsApplication {
 * 
 * private static final Logger log =
 * LoggerFactory.getLogger(DesignPatternsApplication.class);
 * 
 * public static void main(String[] args) {
 * SpringApplication.run(DesignPatternsApplication.class, args); }
 * 
 * @Bean public CommandLineRunner demo(CustomerRepository repository) { return
 * (args) -> { // save a couple of customers repository.save(new
 * Customer("Jack", "Bauer")); repository.save(new Customer("Chloe",
 * "O'Brian")); repository.save(new Customer("Kim", "Bauer"));
 * repository.save(new Customer("David", "Palmer")); repository.save(new
 * Customer("Michelle", "Dessler"));
 * 
 * // fetch all customers log.info("Customers found with findAll():");
 * log.info("-------------------------------"); for (Customer customer :
 * repository.findAll()) { log.info(customer.toString()); } log.info("");
 * 
 * // fetch an individual customer by ID repository.findById(1L)
 * .ifPresent(customer -> { log.info("Customer found with findById(1L):");
 * log.info("--------------------------------"); log.info(customer.toString());
 * log.info(""); });
 * 
 * // fetch customers by last name
 * log.info("Customer found with findByLastName('Bauer'):");
 * log.info("--------------------------------------------");
 * repository.findByLastName("Bauer").forEach(bauer -> {
 * log.info(bauer.toString()); }); // for (Customer bauer :
 * repository.findByLastName("Bauer")) { // log.info(bauer.toString()); // }
 * log.info(""); }; }
 * 
 * }
 */
