package by.education.servlets.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

import static constants.Constants.USER;

@WebFilter(filterName = "AuthenticationFilter", urlPatterns = "/*")
public class AuthenticationFilter implements Filter {
    private final boolean filterOff = true;
    private static final List<String> UNAUTHENTICATED_URLS = List.of("/signIn", "/login", "/signUp", "/register");

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        HttpSession session = httpServletRequest.getSession();

        if (filterOff || UNAUTHENTICATED_URLS.contains(httpServletRequest.getServletPath()) || session.getAttribute(USER) != null) {
            chain.doFilter(request, response);

        } else {
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/signIn");

            System.out.println();

        }
    }
}
