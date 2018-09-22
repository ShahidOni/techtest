package technicaltest.japan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;
import technicaltest.japan.dao.DeveloperRepository;
import technicaltest.japan.dao.LanguageRepository;
import technicaltest.japan.entity.DeveloperLanguageMapping;
import technicaltest.japan.entity.Developer;
import technicaltest.japan.entity.Language;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

@SpringBootApplication
public class TechnicaltestApplication implements CommandLineRunner {

	@Autowired
	private DeveloperRepository repository;

    @Autowired
    private LanguageRepository languageRepository;

	@PersistenceContext
	private EntityManager em;

	public static void main(String[] args) {
		SpringApplication.run(TechnicaltestApplication.class, args);
	}

    @Transactional
	@Override
	public void run(String... strings) throws Exception {
		Optional<Developer> optionalDeveloper = repository.findById(3L);
        Developer developer = optionalDeveloper.get();
        for(DeveloperLanguageMapping mapping : developer.getDeveloperLanguageMappings()) {
            System.out.println(mapping.getLanguage().getCode());
        }

        Optional<Language> languageOptional = languageRepository.findById(1L);
        Language language = languageOptional.get();
        for(DeveloperLanguageMapping mapping : language.getDeveloperLanguageMappings()) {
            System.out.println(mapping.getDeveloper().getName());
        }

	}
}
