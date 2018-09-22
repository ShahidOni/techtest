package technicaltest.japan.dao;

import org.springframework.data.repository.CrudRepository;
import technicaltest.japan.entity.Developer;

/**
 * Created by shain.shahid on 9/22/2018.
 */
public interface DeveloperRepository extends CrudRepository<Developer, Long> {
}
