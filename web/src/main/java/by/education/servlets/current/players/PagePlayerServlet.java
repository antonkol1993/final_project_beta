package by.education.servlets.current.players;

import service.PlayerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PagePlayerServlet", urlPatterns = "/player/*")
public class PagePlayerServlet extends HttpServlet {
    private final PlayerService playerService = PlayerService.getInstance();

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();
        Integer id = Integer.valueOf(pathInfo.startsWith("/") ? pathInfo.substring(1) : pathInfo);

        for (int i = 0; i < playerService.getPlayerList().size(); i++) {
            if (id.equals(playerService.getPlayerList().get(i).getId())) {
                req.setAttribute("ref", playerService.getPlayerList().get(i));
                req.setAttribute("name", playerService.getPlayerList().get(i).getName());
                req.setAttribute("age", playerService.getPlayerList().get(i).getAge());
                req.setAttribute("country", playerService.getPlayerList().get(i).getCountry());
                req.setAttribute("pos", playerService.getPlayerList().get(i).getPosition());
                req.setAttribute("rating", playerService.getPlayerList().get(i).getRating());
                req.setAttribute("id", playerService.getPlayerList().get(i).getId());
                req.getRequestDispatcher("/players/playersPersonInfo.jsp").forward(req, resp);
            }
        }


    }


}



