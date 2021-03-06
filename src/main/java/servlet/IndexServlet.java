package servlet;

import dao.FilmDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "IndexServlet",
        urlPatterns = {""}
)
public class IndexServlet extends HttpServlet {

    FilmDAO filmDAO = new FilmDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute("filmList", filmDAO.filmList());

        getServletContext().getRequestDispatcher("/jsp/index.jsp").forward(req, resp);
//        String nextJSP = "/index.jsp";
//        RequestDispatcher dispatcher = req.getRequestDispatcher(nextJSP);
//        dispatcher.forward(req, resp);
    }

}
