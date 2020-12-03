package ch08.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Kanfeer
 * @package_name ch08.filter
 * @date 2020/11/21 - 9:01
 * @project_name NewProjectByIDEA
 */
public class MyFilter implements Filter {
    public void init(FilterConfig fConfig) throws ServletException{

    }
    public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain)throws IOException,ServletException{
        //System.out.println("����chain.doFilter(request,response)֮ǰ...");
        HttpServletRequest req = (HttpServletRequest) request;
        req.setAttribute("str","a string");
        chain.doFilter(request,response);
        HttpServletResponse res = (HttpServletResponse) response;
        res.setHeader("refresh","3");
        //System.out.println("����chain.doFilter(request,response) ֮��...");
    }
    public void destroy(){

    }
}

