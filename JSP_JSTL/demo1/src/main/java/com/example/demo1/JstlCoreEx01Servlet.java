package com.example.demo1;

import java.io.*;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/jstlCoreExample01")
public class JstlCoreEx01Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public JstlCoreEx01Servlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Dept> list = DBUtils.queryDepartments();
        request.setAttribute("departments", list);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("index.jsp");
        dispatcher.forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}