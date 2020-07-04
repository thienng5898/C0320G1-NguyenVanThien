import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateServlet",urlPatterns = "/display_discount")
public class CalculateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
float listPrice =Float.parseFloat(request.getParameter("price"));

float discountPercent = Float.parseFloat(request.getParameter("discount"));

float discountPrice = (float) (listPrice * discountPercent *0.1);
        PrintWriter writer =response.getWriter();
        writer.println("<html>");
        writer.println("<h1>List price: " + listPrice+ "</h1>");
        writer.println("<h1>Discount Percent: " + discountPercent+ "</h1>");
        writer.println("<h1>discountPrice: " + discountPrice+ "</h1>");
        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
