package by.education.servlets.filter;

import constants.UsersRole;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static constants.Constants.USER;

@WebFilter(filterName = "AuthorizationFilter", urlPatterns = "/admin/*")
public class AuthorizationFilter implements Filter {
    private final boolean filterOff = true;


    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpSession session = httpServletRequest.getSession();

        if (filterOff || session.getAttribute(USER) == UsersRole.ADMIN) {
            chain.doFilter(request, response);

        } else {
            int i = 400;
            ((HttpServletResponse) response).sendError(i);

        }


    }
}
