package anton;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;

public class FormFilter implements Filter {

    private static final ArrayList<User> users = new ArrayList<>();

    @Override
    public void destroy() {
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        if(req.getParameter("check")==null && request.getServletContext().getAttribute("check")!="check"){
            HttpServletResponse response = (HttpServletResponse) resp;
            response.sendRedirect("/my-app/error.html");
        }
        if(request.getServletContext().getAttribute("check")!="check"){
            req.getServletContext().setAttribute("check", "check");
        }
        chain.doFilter(req, resp);
    }
}


