import jakarta.servlet.*;

import java.io.IOException;

public class Filter1 implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Request to the Filter1");
        chain.doFilter(request, response);
        System.out.println("Response to the Filter1");
        response.getWriter().println("Filter1 executed");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter::init");
    }

    @Override
    public void destroy() {
        System.out.println("Filter::destroy");
    }
}
