<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.io.*,java.util.*,java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
	Statement st = conn.createStatement();
	
	String starter = request.getParameter("starter");
	String main_course = request.getParameter("main_course");
	String breads = request.getParameter("breads");
	int s_qty = Integer.parseInt(request.getParameter("s_qty"));
	int m_qty = Integer.parseInt(request.getParameter("m_qty"));
	int b_qty = Integer.parseInt(request.getParameter("b_qty"));
	
	String query1 = "select price from Q7 where name=\""+starter+"\";";
	String query2 = "select price from Q7 where name=\""+main_course+"\";";
	String query3 = "select price from Q7 where name=\""+breads+"\";";
	
	ResultSet rs1 = st.executeQuery(query1);
	rs1.next();
	int price1 = rs1.getInt("price") * s_qty;

	ResultSet rs2 = st.executeQuery(query2);
	rs2.next();
	int price2 = rs2.getInt("price") * m_qty;

	ResultSet rs3 = st.executeQuery(query3);
	rs3.next();
	int price3 = rs3.getInt("price") * b_qty;

	
%>
<center>
<h3>BILL INVOICE</h3>
<table border=1px>
<tr>
<th>NAME</th>
<th>QTY</th>
<th>PRICE</th>
</tr>
<tr>
<td><%=starter %></td>
<td><%=s_qty %></td>
<td><%=price1 %></td>
</tr>
<tr>
<td><%=main_course %></td>
<td><%=m_qty %></td>
<td><%=price2 %></td>
</tr>
<tr>
<td><%=breads %></td>
<td><%=b_qty %></td>
<td><%=price3 %></td>
</tr>
<tr>
<td colspan=2>TOTAL PRICE </td>
<td><%=price1+price2+price3 %></td>
</tr>
</table>
</center>
</body>
</html>