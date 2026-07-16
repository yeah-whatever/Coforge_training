<%@ page import="java.util.*" %>
<%@ page import="com.coforge.model.Product" %>

<html>
<head>
<title>View Products</title>
</head>

<body>

<h2>Product List</h2>

<table border="1">

<tr>
<th>ID</th>
<th>Name</th>
<th>Price</th>
<th>Quantity</th>
</tr>

<%

Collection<Product> list=(Collection<Product>)request.getAttribute("list");

for(Product p:list)
{

%>

<tr>

<td><%=p.getProductId()%></td>

<td><%=p.getProductName()%></td>

<td><%=p.getProductPrice()%></td>

<td><%=p.getProductQuantity()%></td>

</tr>

<%

}

%>

</table>

</body>
</html>