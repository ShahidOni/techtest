package technicaltest.japan.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import technicaltest.japan.entity.ProgrammingLanguage;

/**
 * Created by shain.shahid on 9/22/2018.
 */
public interface ProgrammingLanguageRepository extends CrudRepository<ProgrammingLanguage, Long> {
    ProgrammingLanguage findProgrammingLanguageByName(@Param("name") String name);
}
