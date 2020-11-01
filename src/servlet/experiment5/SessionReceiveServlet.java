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
 * @date 2020/10/22 - 8:09
 * @project_name NewProjectByIDEA
 */
@WebServlet(name = "SessionReceiveServlet",urlPatterns = "/SessionReceiveServlet")
public class SessionReceiveServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        out.println("<html><head><head><title>Experiment5 SessionReceiveServlet</title></head><body>");
        User requestSessionUser = (User) session.getAttribute("requestSessionUser");
        out.print(requestSessionUser.getName() + requestSessionUser.getPassword());
        out.print("This is SessionReceiveServlet");
        out.println("</body><html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
        //System.out.println(receiveUser.getName()+receiveUser.getSex());
    }
}
