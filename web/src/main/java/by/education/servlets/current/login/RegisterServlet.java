package by.education.servlets.current.login;//package by.education.servlets.current.login;
//
//import constants.Constants;
//import service.PersonService;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet(urlPatterns = "/register")
//public class RegisterServlet extends HttpServlet {
//    PersonService personService = PersonService.getInstance();
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String userName = req.getParameter("userName");
//        String password = req.getParameter("password");
//        if (personService.isUniqueUser(userName)) {
//            personService.addPerson(userName, password);
//            req.getSession().setAttribute(Constants.USER, personService.getPersonByUserName(userName));
//            resp.sendRedirect(req.getContextPath() + "/informational/signUpSuccess.jsp");
//        } else {
//            resp.sendRedirect(req.getContextPath() + "/informational/failedRegistrationLogin.jsp");
//        }
//    }
//}
