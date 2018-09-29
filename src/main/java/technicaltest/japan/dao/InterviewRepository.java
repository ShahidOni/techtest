package technicaltest.japan.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import technicaltest.japan.entity.Interview;

import java.util.List;

/**
 * Created by shain.shahid on 9/23/2018.
 */
public interface InterviewRepository extends CrudRepository<Interview, Long>, InterviewCustomRespository {
    List<Interview> findInterviewByScore(short score);

}
