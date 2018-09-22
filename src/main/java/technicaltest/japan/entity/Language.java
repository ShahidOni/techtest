package technicaltest.japan.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by shain.shahid on 9/22/2018.
 */

@Entity
@Table(name="languages")
public class Language implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;

    @Column(name ="code")
    private String code;

    @OneToMany(mappedBy = "language", fetch = FetchType.LAZY)
    private List<DeveloperLanguageMapping> developerLanguageMappings;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<DeveloperLanguageMapping> getDeveloperLanguageMappings() {
        return developerLanguageMappings;
    }

    public void setDeveloperLanguageMappings(List<DeveloperLanguageMapping> developerLanguageMappings) {
        this.developerLanguageMappings = developerLanguageMappings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Language language = (Language) o;

        if (id != language.id) return false;
        return code != null ? code.equals(language.code) : language.code == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (code != null ? code.hashCode() : 0);
        return result;
    }
}
