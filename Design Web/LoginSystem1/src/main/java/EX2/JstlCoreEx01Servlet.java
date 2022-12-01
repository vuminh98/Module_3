package EX2;

import EX1.DBUtils;
import EX1.Dept;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

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
    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("example01.jsp");
    dispatcher.forward(request,response);
}

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
