package technicaltest.japan.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by shain.shahid on 9/22/2018.
 */
@Entity
@Table(name = "programming_languages")
public class ProgrammingLanguage implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;

    @Column(name = "name")
    private String name;


    @OneToMany(mappedBy = "programmingLanguage", fetch = FetchType.LAZY)
    private List<DeveloperProgrammingLanguageMapping> developerProgrammingLanguageMappings;


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

    public List<DeveloperProgrammingLanguageMapping> getDeveloperProgrammingLanguageMappings() {
        return developerProgrammingLanguageMappings;
    }

    public void setDeveloperProgrammingLanguageMappings(List<DeveloperProgrammingLanguageMapping> developerProgrammingLanguageMappings) {
        this.developerProgrammingLanguageMappings = developerProgrammingLanguageMappings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProgrammingLanguage that = (ProgrammingLanguage) o;

        if (id != that.id) return false;
        return name != null ? name.equals(that.name) : that.name == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
