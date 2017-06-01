package servlet.film;

import dao.FilmDAO;
import entity.Film;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "UpdateFilmServlet",
        urlPatterns = {"/film/update"}
)
public class UpdateServlet extends HttpServlet {
    FilmDAO filmDAO = new FilmDAO();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int filmId = Integer.parseInt(req.getParameter("id"));
        Film film = filmDAO.findFilmById(filmId);
        film.setName(req.getParameter("name"));
        film.setDirector(req.getParameter("director"));
        film.setCast(req.getParameter("cast"));
        film.setAgeLimit(req.getParameter("ageLimit"));
        film.setDescription(req.getParameter("description"));
        film.setPosterUrl(req.getParameter("posterUrl"));
        film.setTrailerUrl(req.getParameter("trailerUrl"));
        filmDAO.updateFilm(film);

        String nextJSP = "/film/details/" + film.getId();
        resp.sendRedirect(nextJSP);
    }
}

