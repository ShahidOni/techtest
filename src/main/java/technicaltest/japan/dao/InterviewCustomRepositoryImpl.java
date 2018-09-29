package technicaltest.japan.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.NoRepositoryBean;
import technicaltest.japan.entity.Interview;

import java.util.List;

/**
 * Created by shain.shahid on 9/23/2018.
 */
public class InterviewCustomRepositoryImpl implements InterviewCustomRespository {

    @Autowired
    private DeveloperRepository developerRepository;

}
