package servlet.hall;

import dao.FilmHallDAO;
import entity.FilmHall;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "UpdateServlet",
        urlPatterns = {"/hall/update"}
)
public class UpdateServlet extends HttpServlet{
    FilmHallDAO filmHallDAO = new FilmHallDAO();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int filmHallId = Integer.parseInt(req.getParameter("id"));
        FilmHall filmHall = filmHallDAO.findFilmHallById(filmHallId);
        filmHall.setName(req.getParameter("name"));
        filmHallDAO.updateFilmHall(filmHall);

        String nextJSP = "/hall";
        resp.sendRedirect(nextJSP);
    }
}
