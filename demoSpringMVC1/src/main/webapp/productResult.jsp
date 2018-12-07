<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product result</title>
</head>
<body>

	<!-- Declaration tag - placed outside _jspService() so that not getting memory allocated for each request) -->

	<%! String rslt = "Result = "; %>
	
	<%! double product(int a, int b){
		
		return a*b;
		
		}		
		%>
	
	
	<!-- Scriptlet tag -->

	<%
	
		int a = Integer.parseInt(request.getParameter("a"));
		int b = Integer.parseInt(request.getParameter("b"));
		
		out.print(rslt + (a*b) );
		
		out.println("calling product method");
		out.print(rslt + product(a,b));
	%>
	
	<!-- Expression tag -->
	
	 <%= rslt + ( Integer.parseInt(request.getParameter("a")) * Integer.parseInt(request.getParameter("b")) ) %>
	 
	 <h3> calling product method in expression tag</h3>
	 
	 <%= rslt + product( Integer.parseInt(request.getParameter("a")),Integer.parseInt(request.getParameter("b")) ) %>
	
	<a href="jspWelcome.jsp"> go back</a>
	
</body>
</html>