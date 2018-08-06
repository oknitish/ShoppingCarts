package com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HelloServlet
 */

/**
 * @author Srinivas
 *
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
//	private static String PATH="/showBookDetails";
	
	
	
	
	
	
	
	/**
     * @see HttpServlet#HttpServlet()
     */
	
	
	
	
	
    public SearchServlet() {
      
    	System.out.println("SearchServlet");
    	
        
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("SearchServlet init()");
		
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

System.out.println("in doget");
	
String category=request.getParameter("category");	

System.out.println("category"+category);
List books=new ArrayList();
 

HttpSession session=request.getSession();

System.out.println(session.getId());

if(category.equals("java")) {
	
	books.add("java books1");
	books.add("java books2");
	books.add("java books3");
	books.add("java books4");
	books.add("java books5");

	
	session.setAttribute("BOOKS", books);
	
	RequestDispatcher rd=request.getRequestDispatcher("showBooks.jsp");
	
	rd.forward(request, response);
}







}
	
	
}
