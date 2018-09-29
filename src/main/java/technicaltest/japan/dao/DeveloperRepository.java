package technicaltest.japan.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import technicaltest.japan.entity.Developer;

/**
 * Created by shain.shahid on 9/22/2018.
 */
public interface DeveloperRepository extends CrudRepository<Developer, Long> {
    Developer findByEmailId(@Param("emailId") String email);
}
