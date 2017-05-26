package dao;

import model.Film;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateConnector;


public class FilmDAO {
    public Film addFilm(Film film) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateConnector.getInstance().getSession();
            System.out.println("session : "+session);
            transaction = session.beginTransaction();
            session.save(film);
            transaction.commit();
            return film;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
