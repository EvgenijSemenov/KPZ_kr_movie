package entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="Film_hall")
public class FilmHall implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "filmHall", cascade = CascadeType.ALL)
    private List<FilmSession> filmSessions;

    public FilmHall() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FilmSession> getFilmSessions() {
        return filmSessions;
    }

    public void setFilmSessions(List<FilmSession> filmSessions) {
        this.filmSessions = filmSessions;
    }
}
