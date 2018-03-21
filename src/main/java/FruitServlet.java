import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Fruits", value = "/fruit")
public class FruitServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

        String fruit = httpServletRequest.getParameter("fruits");
        if (fruit.equalsIgnoreCase("jablko")) {
            RequestDispatcher rD = httpServletRequest.getRequestDispatcher("apple.jsp");
            rD.forward(httpServletRequest, httpServletResponse);
        } else {
            RequestDispatcher rD = httpServletRequest.getRequestDispatcher("otherFruit.jsp");
            rD.forward(httpServletRequest, httpServletResponse);

        }

    }
}