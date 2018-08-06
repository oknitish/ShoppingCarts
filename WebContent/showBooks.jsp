<%@page import="java.util.List"%>

<html>
<head>
</head>

<body>

<table>

  <%
    int c=1;
    
   List<String>   books=    (List)session.getAttribute("BOOKS");
    
      
   for(String bn:books){
    %>



<tr><td><%=c++ %></td> <td><%=bn %></td>  <td><form action="viewdetails"><input type="hidden"  name="bookname"  value="<%=bn%>"><input type="submit" value="View Details"></form></td> 

  <td>
<form action="addtocart">
<input type="hidden" name="bookname"  value="<%=bn %>">
<input type="submit" value="Add to Cart"> 
</form>

</td>


</tr>
<%
}
   
   
   

%>

</table>
<form action="showcart">

<input type="submit" value="Show my Cart">

</form>

</body>

</html>

  