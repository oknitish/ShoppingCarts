package com;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class MyFilter
 */
public class MyFilter implements Filter {

   
    public MyFilter() {
    
    	
    	
    System.out.println("myfilter constuctor");
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("destroy-filter");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("before do filter");
		chain.doFilter(request, response);
	
	System.out.println("after do filter");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig filterConfig) throws ServletException {
	System.out.println("init method   filter");
	
	 String contextPath = filterConfig.getServletContext().getContextPath();
     //String ignoreStr = filterConfig.getInitParameter("ignoreReqPrefix");
	
     System.out.println(contextPath);
    // System.out.println(ignoreStr);
     
     
	}

}
