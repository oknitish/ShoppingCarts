package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddtoCartServlet
 */
@WebServlet("/addtocart")
public class AddtoCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddtoCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("in addtocatrt servlet");
		
		
		String bookname=request.getParameter("bookname");
		
		System.out.println("bookname"+bookname+"  is added");
		
		HttpSession session=request.getSession();
		
		session.setAttribute(bookname, bookname);
		RequestDispatcher rd=request.getRequestDispatcher("showBooks.jsp");
		rd.forward(request, response);
		
	}

}
