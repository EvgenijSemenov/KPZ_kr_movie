package entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name="Film_session")
public class FilmSession implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Type(type="hibernate.type.LocalDateTimeUserType")
    @Column(name = "session_date")
    private LocalDateTime sessionDate;
    @ManyToOne
    @JoinColumn(name = "film_id", referencedColumnName = "id")
    private Film film;
    @ManyToOne
    @JoinColumn(name = "film_hall_id", referencedColumnName = "id")
    private FilmHall filmHall;
}
