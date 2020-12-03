package ch08.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


/**
 * @author Kanfeer
 * @package_name ch08.filter
 * @date 2020/11/21 - 9:22
 * @project_name NewProjectByIDEA
 */
@WebFilter(filterName = "utf8Filter",value = {"/servlet/experiment5/ReceiveServlet","/servlet/experiment5/RequestScopeServlet"},dispatcherTypes = {DispatcherType.REQUEST})
public class UTF8EncodingFilter implements Filter {
    public void init (FilterConfig filterConfig) throws ServletException{}
    public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        chain.doFilter(request,response);
    }
    public void destroy(){}
}
