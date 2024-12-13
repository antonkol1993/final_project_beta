package by.education.servlets.current.persons;

import objects.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.PersonService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/persons/edit/*")
public class EditPersonServlet extends HttpServlet {

    @Autowired
    private PersonService personService;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String pathInfo = req.getPathInfo();
        int personId = Integer.parseInt(pathInfo.substring(1));

        Person person = personService.getPersonById(personId);

        String servletPath = req.getServletPath();
        req.setAttribute("username", person.getUserName());
        req.setAttribute("password", person.getPassword());
        req.setAttribute("id", person.getId());
        req.setAttribute("input", "Edit");
        req.setAttribute("servletPath", servletPath);
        req.getRequestDispatcher("/persons/personsEdit.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Integer id = Integer.parseInt(req.getParameter("id"));
        personService.editPerson(id, username, password);
        resp.sendRedirect(req.getContextPath() + "/persons");
    }


}