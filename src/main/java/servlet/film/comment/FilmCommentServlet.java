package servlet.film.comment;

import dao.FilmCommentDAO;
import dao.FilmDAO;
import entity.Film;
import entity.FilmComment;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet(
        name = "FilmCommentServlet",
        urlPatterns = {"/film-comment"}
)
public class FilmCommentServlet extends HttpServlet {
    FilmDAO filmDAO = new FilmDAO();
    FilmCommentDAO filmCommentDAO = new FilmCommentDAO();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FilmComment filmComment = new FilmComment();
        filmComment.setCreateDate(LocalDateTime.now());
        filmComment.setAuthorName(req.getParameter("authorName"));
        filmComment.setComment(req.getParameter("comment"));

        Film film = filmDAO.findFilmById(Integer.parseInt(req.getParameter("filmId")));
        filmComment.setFilm(film);

        filmCommentDAO.addFilmComment(filmComment);

        String nextJSP = "/film/details/" + req.getParameter("filmId");
        resp.sendRedirect(nextJSP);
    }
}
