package com.example.thuchanh4;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "TranslationServlet", value = "/translate")
public class TranslationServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Hello", "Xin Chao");
        dictionary.put("How?", "Nhu the nao");
        dictionary.put("Book", "Quyen sach");
        dictionary.put("Astronaut", "Phi hanh gia");
        dictionary.put("Computer", "May tinh");

        String search = request.getParameter("txtSearch");

        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        String result = dictionary.get(search);
        if (result != null) {
            writer.println("Word: " + search);
            writer.println("<br>");
            writer.println("Result: " + result);
        } else {
            writer.println("Not found");
        }
        writer.println("<html>");
    }

}