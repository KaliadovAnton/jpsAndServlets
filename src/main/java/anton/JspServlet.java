package anton;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = ("/temp-serv"))
public class JspServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Good> goods = new ArrayList<Good>() {{
            add(new Good("Book", 5));
            add(new Good("Postcard", 2));
            add(new Good("Newspaper", 1));
            add(new Good("Brochure", 3));
        }};
        String[] names = {};
        req.setAttribute("goods", goods);
        req.setAttribute("name", (req.getParameterMap().get("name"))[0]);
        getServletContext().getRequestDispatcher("/first-jsp.jsp").forward(req, resp);
    }
}
