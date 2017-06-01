package servlet.film;

import dao.FilmDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "EditFilmServlet",
        urlPatterns = {"/film/edit/*"}
)
public class EditServlet extends HttpServlet {
    FilmDAO filmDAO = new FilmDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();
        String[] pathParts = pathInfo.split("/");
        String part1 = pathParts[1];
        int filmId = Integer.parseInt(part1);

        req.setAttribute("film", filmDAO.findFilmById(filmId));

        String nextJSP = "/jsp/film/edit.jsp";
        RequestDispatcher dispatcher = req.getRequestDispatcher(nextJSP);
        dispatcher.forward(req, resp);
    }
}
