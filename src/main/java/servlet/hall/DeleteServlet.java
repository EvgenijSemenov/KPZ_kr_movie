package servlet.hall;

import dao.FilmDAO;
import dao.FilmHallDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "DeleteServlet",
        urlPatterns = {"/hall/delete/*"}
)
public class DeleteServlet extends HttpServlet {
    FilmHallDAO filmHallDAO = new FilmHallDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();
        String[] pathParts = pathInfo.split("/");
        String part1 = pathParts[1];
        int hallId = Integer.parseInt(part1);
        filmHallDAO.deleteFilmHallById(hallId);

        String nextJSP = "/hall";
        resp.sendRedirect(nextJSP);
    }
}
