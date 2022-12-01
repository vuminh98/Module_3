package com.example.thuchanh3;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ConverterServlet", value = "/convert")
public class ConverterServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        float rate = Float.parseFloat(request.getParameter("rate"));
        float usd = Float.parseFloat(request.getParameter("usd"));

        float vnd = rate * usd;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Rate: " + rate + "<h1>");
        writer.println("<h1>USD: " + usd + "<h1>");
        writer.println("<h1>VND: " + vnd + "<h1>");
        writer.println("<html>");
    }
}