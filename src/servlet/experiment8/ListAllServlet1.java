package servlet.experiment8;

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
 * @date 2020/11/5 - 8:27
 * @project_name NewProjectByIDEA
 */
@WebServlet(name = "ListAllServlet1" , urlPatterns = {"/ListAllServlet1"})
public class ListAllServlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        try {
            List<User> list = user.listAllUser();
            request.setAttribute("users",list);
            request.getRequestDispatcher("/ch05/experiment8/ListAll.jsp").forward(request,response);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
