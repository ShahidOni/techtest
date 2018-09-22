package technicaltest.japan.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by shain.shahid on 9/22/2018.
 */

@Entity
@Table(name = "developer_language_mapping")
public class DeveloperLanguageMapping implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "developer_id")
    private Developers developer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "language_id")
    private Language language;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    public Language getLanguage() {
        return language;
    }

    public Developers getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developers developer) {
        this.developer = developer;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeveloperLanguageMapping that = (DeveloperLanguageMapping) o;

        if (id != that.id) return false;
        if (developer != null ? !developer.equals(that.developer) : that.developer != null) return false;
        return language != null ? language.equals(that.language) : that.language == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (developer != null ? developer.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        return result;
    }
}
