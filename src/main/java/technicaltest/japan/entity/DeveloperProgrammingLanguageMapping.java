package technicaltest.japan.entity;

import javax.persistence.*;

/**
 * Created by shain.shahid on 9/22/2018.
 */
@Entity
@Table(name = "developer_programming_language_mapping")
public class DeveloperProgrammingLanguageMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "developer_id")
    private Developer developer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "programming_language_id")
    private ProgrammingLanguage programmingLanguage;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public ProgrammingLanguage getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(ProgrammingLanguage programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeveloperProgrammingLanguageMapping that = (DeveloperProgrammingLanguageMapping) o;

        if (id != that.id) return false;
        if (developer != null ? !developer.equals(that.developer) : that.developer != null) return false;
        return programmingLanguage != null ? programmingLanguage.equals(that.programmingLanguage) : that.programmingLanguage == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (developer != null ? developer.hashCode() : 0);
        result = 31 * result + (programmingLanguage != null ? programmingLanguage.hashCode() : 0);
        return result;
    }
}
