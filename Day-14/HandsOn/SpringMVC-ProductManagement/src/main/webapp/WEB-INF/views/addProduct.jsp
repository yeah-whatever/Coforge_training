<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>Add Product</title>
</head>

<body>

<h2>Add Product</h2>

<form:form action="save" modelAttribute="product" method="post">

Product ID :
<form:input path="productId"/>

<br><br>

Product Name :
<form:input path="productName"/>

<br><br>

Product Price :
<form:input path="productPrice"/>

<br><br>

Product Quantity :
<form:input path="productQuantity"/>

<br><br>

<input type="submit" value="Save">

</form:form>

</body>
</html>