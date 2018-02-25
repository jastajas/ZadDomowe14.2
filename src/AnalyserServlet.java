import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AnalyserServlet")
public class AnalyserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.print("<h2>Podany tekst:</h2>");
        writer.print("<p>" + request.getParameter("toAnalyze") + "</p>");
        writer.print("<h3>Zawiera ilość słów: " + TextAnalyser.numberOfWords(request) + "</h3>");
        writer.print("<h3>Zawiera liczbę znaków: " + TextAnalyser.numberOfChars(request) + "</h3>");
        writer.print("<h3>Zawiera liczbę znaków bez spacji: " + TextAnalyser.blackChars(request) + "</h3>");
        writer.print("<h3>Palindrom: " + TextAnalyser.palindromTest(request) + "</h3>");
        writer.print("<form method=" + '"' + "get" + '"' + " action=" + '"' + "http://localhost:8080/" + '"' +">");
        writer.print ("<input type=" + '"' + "submit" + '"' + "value=" + '"' + "Powrót" + '"' + ">");
        writer.print("</form>");
        writer.println("</body>");
        writer.println("</html>");



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {




    }
}
