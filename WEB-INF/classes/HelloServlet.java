import java.io.PrintWriter;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 

public class HelloServlet extends HttpServlet {
 
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {         
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.write("<h2>Hello from HelloServlet</h2>\n");
		writer.write("<p>" + 
						"<a href=\"/helloapp\">back</a>" + 
					 "</p>");
    }
}