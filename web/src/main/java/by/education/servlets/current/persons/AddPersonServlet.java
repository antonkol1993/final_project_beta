package by.education.servlets.current.persons;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.PersonService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/persons/add")
public class AddPersonServlet extends HttpServlet {

    @Autowired
    private PersonService personService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String servletPath = req.getServletPath();
        req.setAttribute("username", "");
        req.setAttribute("password", "");
        req.setAttribute("role", "");
        req.setAttribute("input", "Create");
        req.setAttribute("servletPath", servletPath);
        req.setAttribute("id", "");
        req.getRequestDispatcher("/persons/personsAdd.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (personService.isUniqueUser(username)) {
            personService.addPerson(username, password);
            resp.sendRedirect(req.getContextPath() + "/persons");
        } else {
            String servletPath = req.getServletPath();
            req.setAttribute("servletPath", servletPath);
            req.getRequestDispatcher("../informational/persons/userAlreadyExists.jsp").forward(req, resp);
        }


    }


}