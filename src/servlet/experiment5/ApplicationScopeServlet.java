package servlet.experiment5;

import ch06.User;

import javax.servlet.ServletContext;
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
@WebServlet(name = "ApplicationScopeServlet",urlPatterns = "/ApplicationScopeServlet")

public class ApplicationScopeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Experiment5 Servlet</title></head><body>");
        out.print("Hello Experiment5 ApplicationServlet");
        out.println("</body><html>");

        User requestApplicationUser = new User();
        requestApplicationUser.setAge(10);
        requestApplicationUser.setName("Kanfeer Application");
        requestApplicationUser.setPassword("123456");
        requestApplicationUser.setSex("ÄÐ");
        requestApplicationUser.setBirthday("2001-8-9");
        ServletContext application = this.getServletContext();
        application.setAttribute("requestApplicationUser",requestApplicationUser);
        request.getRequestDispatcher("ApplicationReceiveServlet").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
        //response
    }
}
