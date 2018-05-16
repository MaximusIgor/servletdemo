package home.ihorshylov.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> headersName = req.getHeaderNames();
        System.out.println("Request parameters: " + req.getQueryString());
        System.out.println("Request uri: " + req.getRequestURI());
        System.out.println("Method: " + req.getMethod());
        while (headersName.hasMoreElements()) {
            String headerName = headersName.nextElement();
            System.out.println("Header: " + headerName + " value: " + req.getHeader(headerName));

        }
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        PrintWriter writer = resp.getWriter();
        writer.print("<h1> Привет мир Java EE</h1>");
    }
}
