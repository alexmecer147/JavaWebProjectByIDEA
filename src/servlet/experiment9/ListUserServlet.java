package servlet.experiment9;

import servlet.experiment7.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Kanfeer
 * @package_name ${PACKAGE_NAME}
 * @date 2020/11/28 - 17:14
 * @project_name NewProjectByIDEA
 */
@WebServlet(name = "ListUserServlet" ,urlPatterns = {"/ListUserServlet"})
public class ListUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // String name = request.getParameter("name");
        try {
            List<User> lists = new User().getUserByName2(request.getParameter("name"));
            request.setAttribute("lists",lists);
            request.getRequestDispatcher("/ch07/experiment9/findUsers.jsp").forward(request,response);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
