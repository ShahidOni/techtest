package technicaltest.japan.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import technicaltest.japan.entity.Language;

/**
 * Created by shain.shahid on 9/22/2018.
 */
public interface LanguageRepository extends CrudRepository<Language, Long> {
    Language findLanguageByCode(@Param("code") String code);

}
