package technicaltest.japan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import technicaltest.japan.dao.DeveloperRepository;
import technicaltest.japan.entity.Developers;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@SpringBootApplication
public class TechnicaltestApplication implements CommandLineRunner {

	@Autowired
	private DeveloperRepository repository;

	@PersistenceContext
	private EntityManager em;

	public static void main(String[] args) {
		SpringApplication.run(TechnicaltestApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

	}
}
