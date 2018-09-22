package technicaltest.japan.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by shain.shahid on 9/22/2018.
 */

@Entity
@Table(name = "developers")
public class Developer implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email_id")
    private String emailId;

    @OneToMany(mappedBy = "developer", fetch = FetchType.LAZY)
    private List<DeveloperLanguageMapping> developerLanguageMappings;

    @OneToMany(mappedBy = "developer", fetch = FetchType.LAZY)
    private List<DeveloperProgrammingLanguageMapping> developerProgrammingLanguageMappings;

    @OneToMany(mappedBy = "developer",fetch = FetchType.LAZY)
    private List<Interview> listOfInterviews;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public List<DeveloperLanguageMapping> getDeveloperLanguageMappings() {
        return developerLanguageMappings;
    }

    public void setDeveloperLanguageMappings(List<DeveloperLanguageMapping> developerLanguageMappings) {
        this.developerLanguageMappings = developerLanguageMappings;
    }

    public List<DeveloperProgrammingLanguageMapping> getDeveloperProgrammingLanguageMappings() {
        return developerProgrammingLanguageMappings;
    }

    public void setDeveloperProgrammingLanguageMappings(List<DeveloperProgrammingLanguageMapping> developerProgrammingLanguageMappings) {
        this.developerProgrammingLanguageMappings = developerProgrammingLanguageMappings;
    }

    public List<Interview> getListOfInterviews() {
        return listOfInterviews;
    }

    public void setListOfInterviews(List<Interview> listOfInterviews) {
        this.listOfInterviews = listOfInterviews;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Developer that = (Developer) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return emailId != null ? emailId.equals(that.emailId) : that.emailId == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (emailId != null ? emailId.hashCode() : 0);
        return result;
    }
}
