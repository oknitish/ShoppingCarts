package com;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShowCartServlet
 */
@WebServlet("/showcart")
public class ShowCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("in SHOW CART SERVLET");
		
		
		
		
		HttpSession session=request.getSession();
		System.out.println(session.getId());
		Enumeration<String> e=session.getAttributeNames();
		
		
		
		
		
//		while (e.hasMoreElements()) {
//		      String name = (String) e.nextElement();
//		     System.out.println("attribute name"+session.getAttribute(name)); 
//		    }

		
		
		
		  List<String>  list= Collections.list(e);
		  list.remove("BOOKS");
		list.remove("BOOKNAME");
		session.setAttribute("CART", list);
		
		RequestDispatcher  rd=request.getRequestDispatcher("showCart.jsp");
		rd.forward(request, response);
		
	}

}
