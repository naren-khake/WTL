<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<%
	response.setHeader("Cache-Control","no-store");
	response.setHeader("Pragma","no-cache");
	
	String id = request.getParameter("username");
	String pass = request.getParameter("password");

		if(session.isNew()){
			session.setAttribute("id",id);
			out.println("<h1>LOGIN SUCCESSFUL</h1><br>");
		}
		else{
			String user = (String) session.getAttribute("id");
			
			if(user.equals(id)){
				out.println("<h1>USER IS ALREADY LOGIN</h1><br>");
			}
			else{
				session.setAttribute("id",id);
				out.println("<h1>LOGIN SUCCESSFUL</h1><br>");	
			}
		}

	
%>
<form action='logout.jsp'><button type='submit'>LOGOUT</button></form>
</div>
</body>
</html>