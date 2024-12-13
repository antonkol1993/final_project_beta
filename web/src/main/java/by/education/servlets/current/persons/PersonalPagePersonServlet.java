package by.education.servlets.current.persons;

import constants.UsersRole;
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


@WebServlet(urlPatterns = "/person/*")
public class PersonalPagePersonServlet extends HttpServlet {
    @Autowired
    private PersonService personService;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int personId = Integer.parseInt(req.getPathInfo().startsWith("/") ?
                req.getPathInfo().substring(1) : req.getPathInfo());
        Person personById = personService.getPersonById(personId);
        int id = personById.getId();
        String name = personById.getUserName();
        String password = personById.getPassword();
        UsersRole role = personById.getUserRole();

        req.setAttribute("id", id);
        req.setAttribute("name", name);
        req.setAttribute("password", password);
        req.setAttribute("role", role);
        req.getRequestDispatcher("/persons/personsPersonInfo.jsp").forward(req, resp);
    }

}
