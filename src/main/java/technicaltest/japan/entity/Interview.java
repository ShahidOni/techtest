package technicaltest.japan.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by shain.shahid on 9/23/2018.
 */
@Entity
@Table(name = "interviews")
public class Interview  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;

    @Column(name = "score")
    private short score;

    @Column(name = "comments")
    private String comments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "developer_id")
    private Developer developer;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public short getScore() {
        return score;
    }

    public void setScore(short score) {
        this.score = score;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Interview interview = (Interview) o;

        if (id != interview.id) return false;
        if (score != interview.score) return false;
        if (comments != null ? !comments.equals(interview.comments) : interview.comments != null) return false;
        return developer != null ? developer.equals(interview.developer) : interview.developer == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) score;
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (developer != null ? developer.hashCode() : 0);
        return result;
    }
}
