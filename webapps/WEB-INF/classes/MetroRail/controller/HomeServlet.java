package MetroRail.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("title", "Home");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/HomePage.jsp");
        requestDispatcher.forward(req, resp);
        //Maybe we need to create a request dispatcher in here
    }
}