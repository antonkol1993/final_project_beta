package by.education.servlets.current.players;

import service.PlayerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddPlayerServlet", urlPatterns = "/players/add")
public class AddPlayerServlet extends HttpServlet {
    //@Autowired
    PlayerService playerService = PlayerService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("name", "");
        req.setAttribute("age", "");
        req.setAttribute("country", "");
        req.setAttribute("role", "");
        req.setAttribute("input", "Create");
        req.setAttribute("url", "/players/add");
        req.setAttribute("rating", "");
        req.getRequestDispatcher("/players/playersAdd.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        Integer age = Integer.valueOf(req.getParameter("age"));
        String country = req.getParameter("country");
        String role = req.getParameter("role");
        String rating = req.getParameter("rating");
        if (!playerService.isUnique(name, age, country, role)) {
            req.getRequestDispatcher("/informational/userAlreadyExists.jsp").forward(req, resp);
        }
        try {
            playerService.addPlayer(name, age, country, role, rating);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        resp.sendRedirect(req.getContextPath() + "/players");
    }
}
