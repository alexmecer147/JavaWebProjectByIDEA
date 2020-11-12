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
 * @date 2020/11/12 - 8:18
 * @project_name NewProjectByIDEA
 */
@WebServlet(name = "ListUsersServlet" ,urlPatterns = {"/ListUsersServlet","/lst"})
public class ListUsersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<User> users = new User().listAllUser();
            request.setAttribute("users",users);
            System.out.println(users.size()+"ด๓ะก");
            request.getRequestDispatcher("/ch07/experiment9/listUsers.jsp").forward(request,response);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
