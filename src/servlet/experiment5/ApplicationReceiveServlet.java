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
 * @date 2020/10/22 - 8:09
 * @project_name NewProjectByIDEA
 */
@WebServlet(name = "ApplicationReceiveServlet",urlPatterns = "/ApplicationReceiveServlet")
public class ApplicationReceiveServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        ServletContext application = this.getServletContext();
        out.println("<html><head><title>Experiment5 ApplicationReceiveServlet</title></head><body>");
        User requestApplicationUser = (User) application.getAttribute("requestApplicationUser");
        out.print(requestApplicationUser.getName() + requestApplicationUser.getPassword());
        out.print("This is ApplicationReceiveServlet");
        out.println("</body><html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
        //System.out.println(receiveUser.getName()+receiveUser.getSex());
    }
}
