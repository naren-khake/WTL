package com.Q7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2227701711276220401L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String name = req.getParameter("name");
		float salary = Float.parseFloat(req.getParameter("salary"));
		float tax=0;
		
		if(salary <=250000) {
			tax=0;
		}
		else if(salary> 250000 && salary <=500000) {
			tax = (float) (salary * 0.1);
		}
		else {
			tax = (float) (salary * 0.2);
		}
		
		PrintWriter out =res.getWriter();
		out.println(name+"'s INCOME TAX IS "+tax);
	}
}
