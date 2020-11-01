package servlet.experiment5;

import ch06.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Kanfeer
 * @package_name ${PACKAGE_NAME}
 * @date 2020/10/22 - 8:00
 * @project_name NewProjectByIDEA
 */
@WebServlet(name = "RequestScopeServlet",urlPatterns = "/RequestScopeServlet")

public class RequestScopeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Experiment5 Servlet</title></head><body>");
        out.print("Hello Experiment5 Servlet888");
        out.println("</body><html>");

        User requestUser = new User();
        requestUser.setAge(10);
        requestUser.setName("Kanfeer");
        requestUser.setPassword("123456");
        requestUser.setSex("ÄÐ");
        requestUser.setBirthday("2001-8-9");
        request.setAttribute("requestUser",requestUser);
        //request.getRequestDispatcher("ReceiveServlet").forward(request,response);
        //response.sendRedirect("ReceiveServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
        //response
    }
}
