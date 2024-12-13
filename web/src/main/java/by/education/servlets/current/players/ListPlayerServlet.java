package by.education.servlets.current.players;

import objects.Player;
import service.PlayerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListPlayerServlet", urlPatterns = "/players")
public class ListPlayerServlet extends HttpServlet {

    private final PlayerService playerService = PlayerService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Player> list;
        try {
            list = playerService.getPlayerList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        req.setAttribute("list", list);
        req.getRequestDispatcher("/players/playersList.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }


}