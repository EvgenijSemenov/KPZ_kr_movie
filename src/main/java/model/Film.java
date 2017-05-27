package model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

@Entity
@Table(name="Film")
public class Film implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "director")
    private String director;
    @Column(name = "cast")
    private String cast;
    @Column(name = "age_limit")
    private String ageLimit;
    @Column(name = "description")
    @Type(type="org.hibernate.type.StringClobType")
    private String description;
    @Column(name = "poster_url")
    private String posterUrl;
    @Column(name = "trailer_url")
    private String trailerUrl;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "film", cascade = CascadeType.ALL)
    //@JoinColumn(name = "comment", referencedColumnName = "id")
    private List<FilmComment> filmCommentList;

    public Film() {}

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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(String ageLimit) {
        this.ageLimit = ageLimit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public String getTrailerUrl() {
        return trailerUrl;
    }

    public void setTrailerUrl(String trailerUrl) {
        this.trailerUrl = trailerUrl;
    }

    public List<FilmComment> getFilmCommentList() {
        return filmCommentList;
    }

    public void setFilmCommentList(List<FilmComment> filmCommentList) {
        this.filmCommentList = filmCommentList;
    }
}
