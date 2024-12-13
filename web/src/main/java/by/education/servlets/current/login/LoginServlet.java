package by.education.servlets.current.login;//package by.education.servlets.current.login;
//
//import constants.UsersRole;
//import objects.Person;
//import service.PersonService;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//import static constants.Constants.USER;
//
//@WebServlet(name = "LoginServlet", urlPatterns = "/login")
//public class LoginServlet extends HttpServlet {
//
//    PersonService personService = PersonService.getInstance();
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String userName = req.getParameter("userName");
//        String password = req.getParameter("password");
//        boolean valid = personService.isValid(userName, password);
//        Person userByPersonName = personService.getPersonByUserName(userName);
//
//        if (valid) {
//            req.getSession().setAttribute(USER, userByPersonName.getUserRole());
//            if (userByPersonName.getUserRole() == UsersRole.USER) {
//                resp.sendRedirect(req.getContextPath() + "/new/players");
//            } else if (userByPersonName.getUserRole() == UsersRole.ADMIN) {
//                resp.sendRedirect(req.getContextPath() + "/admin/persons");
//            }
//        } else {
//            req.setAttribute("answer", "Invalid login or password");
//            req.getRequestDispatcher("/filter/answer.jsp").forward(req, resp);
//        }
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        doGet(req, resp);
//    }
//}
