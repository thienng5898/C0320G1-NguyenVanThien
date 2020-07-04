import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "ServletTranslate", urlPatterns = "/translate")
public class ServletTranslate extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> dictionary = new HashMap<>() ;
        dictionary.put("surprise","Ngạc nhiên chưa" );
        dictionary.put("victory","chiến thắng");
        dictionary.put("sleep","ngủ");
        dictionary.put("empire","đế chế");

        String search =request.getParameter("txtSearch") ;

        PrintWriter writer = response.getWriter() ;
        writer.println("<html>");
        String result = dictionary.get(search) ;
        if (result != null){
            writer.println("Word: " + search);
            writer.println("Result: " + result);
        }else {
            writer.println("Not Found");
        }
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
