package com.Q9;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class First extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7959156424190773327L;

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		String id = req.getParameter("id");

		try {
			    HttpSession session = req.getSession();
	            String ProductId = (String) session.getAttribute("id");
	            
	            if(ProductId.equals(id)) {

		            PrintWriter out = res.getWriter();
	
		            out.println("<!DOCTYPE html>");
		            out.println("<html>");
		            out.println("<head>");
		            out.println("<title>Servlet first</title>");
		            out.println("</head>");
		            out.println("<body><center>");
		            out.println("<h1>Product ID is already exist</h1>");
		            out.println("</center></body>");
		            out.println("</html>");
	            }
	            else {
	            	session.setAttribute("id",id);
	            	RequestDispatcher rd = req.getRequestDispatcher("second");
		            rd.forward(req, res);
	            }
	        } catch (Exception e) {
	            HttpSession session1 = req.getSession();
	            session1.setAttribute("id", id);

	            RequestDispatcher rd = req.getRequestDispatcher("second");
	            rd.forward(req, res);
	        }
			
		}
}
