package servlet.experiment7;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * @author Kanfeer
 * @package_name ${PACKAGE_NAME}
 * @date 2020/10/29 - 11:19
 * @project_name NewProjectByIDEA
 */
@WebServlet(name = "LoginServlet", urlPatterns={"/LoginServlet"})
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Experiment7 Servlet</title></head><body>");
        out.print("LoginServlet");
        out.println("</body><html>");

        String tname = request.getParameter("name");
        String tpassword = request.getParameter("password");
        out.println();

        User p = new User();
        User tuser = new User();
        tuser.setName(tname);
        tuser.setPassword(tpassword);
        try {
            if (p.login(tuser)>0){
                out.println(tname);
                User puser = tuser.getUserByName(tuser.getName());
                request.setAttribute("user",puser);
                request.getRequestDispatcher("/ch05/experiment7/Index.jsp").forward(request,response);
            }else {
                out.write("µÇÂ½Ê§°Ü");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
