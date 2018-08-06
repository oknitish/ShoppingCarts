<%@page import="java.util.List"%>

<html>

<head>

</head>


<body>



<table>
<%

int c=1;
List<String> books=(List)session.getAttribute("CART");

for(String bn:books){
%>


<tr><td><%=c++%></td><td><%=bn%></td><td><form action="remove"><input type="hidden" name="bookname" value="<%=bn%>"><input type="submit" value="remove"></form></td>
</tr>
<% 
}
%>
</table>

<form action="">

<a href="placeOrder.jsp">Place Order</a> </br>
<a  href="showBooks.jsp">CONITNUE SHOPPING</a>
</form>



</body>

</html>





