package servlet.hall;

import dao.FilmDAO;
import dao.FilmHallDAO;
import entity.Film;
import entity.FilmHall;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "HallHallServlet",
        urlPatterns = {"/hall"}
)
public class HallServlet extends HttpServlet {
    FilmHallDAO filmHallDAO = new FilmHallDAO();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FilmHall filmHall = new FilmHall();
        filmHall.setName(req.getParameter("name"));

        filmHallDAO.addFilmHall(filmHall);

        String nextJSP = "/hall";
        resp.sendRedirect(nextJSP);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nextJSP = "/jsp/hall/details.jsp";
        RequestDispatcher dispatcher = req.getRequestDispatcher(nextJSP);
        req.setAttribute("filmHallList", filmHallDAO.filmHallList());
        dispatcher.forward(req, resp);
    }
}
