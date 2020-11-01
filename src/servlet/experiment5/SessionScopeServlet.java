package servlet.experiment5;

import ch06.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Kanfeer
 * @package_name ${PACKAGE_NAME}
 * @date 2020/10/22 - 8:00
 * @project_name NewProjectByIDEA
 */
@WebServlet(name = "SessionScopeServlet",urlPatterns = "/SessionScopeServlet")

public class SessionScopeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Experiment5 Servlet</title></head><body>");
        out.print("Hello Experiment5 SessionServlet");
        out.println("</body><html>");

        User requestSessionUser = new User();
        requestSessionUser.setAge(10);
        requestSessionUser.setName("Kanfeer Session");
        requestSessionUser.setPassword("123456");
        requestSessionUser.setSex("ÄÐ");
        requestSessionUser.setBirthday("2001-8-9");
        HttpSession session = request.getSession();
        session.setAttribute("requestSessionUser",requestSessionUser);
        request.getRequestDispatcher("SessionReceiveServlet").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
        //response
    }
}
