package servlet.experiment5;

import ch06.User;

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
@WebServlet(name = "ReceiveServlet",urlPatterns = "/ReceiveServlet")
public class ReceiveServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        request.setCharacterEncoding("UTF-8");
//        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head><meta http-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8\"><title>Experiment5 ReceiveServlet</title></head><body>");
        if (request.getAttribute("requestUser") != null){
            User receiveUser = (User) request.getAttribute("requestUser");
            out.print(receiveUser.getName() + receiveUser.getPassword());
        }else {
            out.print("因为是重定向，原request中的信息已经丢失，所以User对象为空++++null");
        }
        out.println("</body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
        //System.out.println(receiveUser.getName()+receiveUser.getSex());
    }
}
