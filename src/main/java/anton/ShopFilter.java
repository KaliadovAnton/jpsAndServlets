package anton;

import javax.servlet.*;
import java.io.IOException;

public class ShopFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("finally");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        chain.doFilter(req, resp);
    }

    @Override
    public void destroy() {

    }
}
