package server;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Eugeny on 01.04.2016.
 */
@WebServlet(name = "MainServlet", urlPatterns = {"*.html"})
public class MainServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Calculator calculator = new Calculator();
//        calculator.run();
        List<String> longLines = calculator.findLongerThen(4);
        request.setAttribute("names", calculator.getLines());
        request.setAttribute("longNames", longLines);

        List<Integer> lens = calculator.fillLens(longLines);
        request.setAttribute("lens", lens);
        int sumLen = calculator.sumLen(calculator.getLines());
        request.setAttribute("sumLen", sumLen);
        double res = calculator.integral(0, Math.PI, 1000000, Math::sin);
        request.setAttribute("integral", res);
        request.getRequestDispatcher("/result.jsp").forward(request,response);
    }
}
