package anton;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@WebServlet()
public class MainServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("cart", makeACart(req.getParameterMap().get("select")));
        getServletContext().getRequestDispatcher("/cart.jsp").forward(req, resp);
    }

    private Cart makeACart(String[] goods) {
        HashMap<String, Integer> filling = new HashMap<>();
        for (String good: goods){
            filling.put(good.split(",")[0], Integer.valueOf(good.split(",")[1]));
        }
        return new Cart(getUserName(goods), filling);
    }

    private String getUserName(String[] selects) {
        return selects[0].split(",")[2];
    }
}
