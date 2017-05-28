package servlet.hall;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "AddHallServlet",
        urlPatterns = {"/hall/add"}
)
public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nextJSP = "/jsp/hall/add.jsp";
        RequestDispatcher dispatcher = req.getRequestDispatcher(nextJSP);
        dispatcher.forward(req, resp);
    }
}
