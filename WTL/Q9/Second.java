package com.Q9;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Second extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5055688763157824801L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter out = res.getWriter();
		HttpSession session = req.getSession();
		
		out.println("<html>");
		out.println("<head>");
        out.println("<title>Servlet Second</title>");
        out.println("</head>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h1>PRODUCT DETAILS</h1>");
		out.println("<h3>PRODUCT ID : "+session.getAttribute("id")+"</h3>");
		out.println("<h3>PRODUCT NAME : "+req.getParameter("name")+"</h3>");
		out.println("<h3>PRODUCT COST : "+req.getParameter("cost")+"</h3>");
		out.println("<h3>PRODUCT QUANTITY : "+req.getParameter("quantity")+"</h3>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");

		
	}
}
