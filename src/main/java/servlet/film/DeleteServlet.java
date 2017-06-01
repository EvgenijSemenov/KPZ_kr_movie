package servlet.film;

import dao.FilmDAO;
import dao.FilmHallDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "DeleteFilmServlet",
        urlPatterns = {"/film/delete/*"}
)
public class DeleteServlet extends HttpServlet {
    FilmDAO filmDAO = new FilmDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();
        String[] pathParts = pathInfo.split("/");
        String part1 = pathParts[1];
        int filmId = Integer.parseInt(part1);
        filmDAO.deleteFilmById(filmId);

        String nextJSP = "/";
        resp.sendRedirect(nextJSP);
    }
}
