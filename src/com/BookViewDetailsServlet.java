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
 * Servlet implementation class BookViewDetailsServlet
 */

@WebServlet("/viewdetails")
public class BookViewDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookViewDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Bookviewdetailsservlet");
		
		HttpSession  session=request.getSession();
		
		String bookname=request.getParameter("bookname");
		
		System.out.println("bookname  "+bookname);
		
	session.setAttribute("BOOKNAME", bookname);
		
		
		RequestDispatcher rd=request.getRequestDispatcher("viewBookDetails.jsp");
		
		rd.forward(request, response);
		
		
		
	}

}
