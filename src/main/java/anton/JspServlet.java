package anton;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(urlPatterns = ("/temp-serv"))
public class JspServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("name") != null) {
            getServletContext().setAttribute("name", req.getParameter("name"));
        }
        req.setAttribute("goods", RangeOfGoods.initRangeOfGoods());
        HttpSession session = req.getSession();
        if (req.getParameter("select") != null) {
            Preorder.addPreorder(req.getParameter("select"));
        }
        req.setAttribute("preorders", Preorder.getPreorders());
        session.setAttribute("name", getServletContext().getAttribute("name"));
        getServletContext().getRequestDispatcher("/first-jsp.jsp").forward(req, resp);
    }
}
