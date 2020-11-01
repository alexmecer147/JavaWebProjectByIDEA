package servlet;

import ch05.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Alex Mecer
 * @date 2020/10/8 - 9:09
 */
public class RegisterUser2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        String name = req.getParameter("userName");
        String password = req.getParameter("password");
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        try {
            int id = user.register();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        //Lis
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
    }
}
