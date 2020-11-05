package servlet.experiment8;

import servlet.experiment7.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Kanfeer
 * @package_name ${PACKAGE_NAME}
 * @date 2020/11/5 - 8:26
 * @project_name NewProjectByIDEA
 */
@WebServlet(name = "RegisterServlet",urlPatterns = {"/RegisterServlet"})
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = -2;
        User user = new User();
        user.setName(request.getParameter("name"));
        user.setPassword(request.getParameter("password"));
        user.setAge(Integer.parseInt(request.getParameter("age")));
        request.setAttribute("user",user);
        try {
            id = user.register();
            if (id>0) {
                request.getRequestDispatcher("/ch05/experiment8/RegisterSuccess.jsp").forward(request, response);
            }else {
                request.getRequestDispatcher("/ch05/experiment8/RegisterFail.jsp").forward(request, response);
            }
        } catch (SQLException e) {
            //request.getRequestDispatcher("RegisterFail.jsp").forward(request,response);
            e.printStackTrace();

        }
        //request.getParameter("name");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
