package servlet.film;

import dao.FilmDAO;
import entity.Film;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "DetailsFilmServlet",
        urlPatterns = {"/film/*"}
)
public class DetailsServlet extends HttpServlet {
    FilmDAO filmDAO = new FilmDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo(); // /{value}/test
        String[] pathParts = pathInfo.split("/");
        String part1 = pathParts[1];
        int filmId = Integer.parseInt(part1);
        if (filmDAO.findFilmById(filmId) != null) {
            String nextJSP = "/jsp/film/details.jsp";
            RequestDispatcher dispatcher = req.getRequestDispatcher(nextJSP);
            req.setAttribute("film", filmDAO.findFilmById(filmId));
            dispatcher.forward(req, resp);
        } else {
            String nextJSP = "/";
            resp.sendRedirect(nextJSP);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Film film = new Film();
        film.setName(req.getParameter("name"));
        film.setDirector(req.getParameter("director"));
        film.setCast(req.getParameter("cast"));
        film.setAgeLimit(req.getParameter("ageLimit"));
        film.setDescription(req.getParameter("description"));
        film.setPosterUrl(req.getParameter("posterUrl"));
        film.setTrailerUrl(req.getParameter("trailerUrl"));

        filmDAO.addFilm(film);

        String nextJSP = "/";
        resp.sendRedirect(nextJSP);
    }
}
