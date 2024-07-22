<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
int a =10;
String name = "Supriya";
int square()
{
	return a*a;
}
%>
<%
out.println("a : "+a);
out.println("Name : "+name);
out.println(square());

int b = 20;
if (b<100)
{
	out.println("B is smaller then 100");
}
else{
	out.println("B is Greater then 100");
}
for(int i=1; i<=5; i++)
{
	out.println(i);
}
//Srting name = request.getParameter("......");
%>

<%= a %>
<%=name %>
<%=square() %>
<%= LocalDate.now() %>
<%= Math.random() %>

</body>
</html>