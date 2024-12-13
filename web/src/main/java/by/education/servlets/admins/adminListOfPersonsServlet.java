package by.education.servlets.admins;

import objects.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.PersonService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/admin/persons")
//@Controller
public class adminListOfPersonsServlet extends HttpServlet {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    private final PersonService personService = context.getBean(PersonService.class);
    List<Person> personList = personService.getPersonList();

    //@Autowired
//    private PersonService personService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("personList", personList);
        req.getRequestDispatcher("/admin/adminPersons.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
