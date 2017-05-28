package dao;

import hibernate.HibernateConnector;
import entity.FilmComment;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FilmCommentDAO {
    public FilmComment addFilmComment(FilmComment filmComment) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateConnector.getInstance().getSession();
            System.out.println("session : "+session);
            transaction = session.beginTransaction();
            session.save(filmComment);
            transaction.commit();
            return filmComment;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
