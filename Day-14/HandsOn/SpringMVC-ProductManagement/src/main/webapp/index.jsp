<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Management System</title>

<style>

body{
    font-family: Arial, Helvetica, sans-serif;
    background-color:#f2f2f2;
    margin:0;
    padding:0;
}

.container{
    width:400px;
    margin:80px auto;
    background:white;
    padding:30px;
    border-radius:10px;
    box-shadow:0px 0px 10px gray;
    text-align:center;
}

h2{
    color:#0d6efd;
    margin-bottom:30px;
}

a{
    display:block;
    width:220px;
    margin:12px auto;
    padding:12px;
    text-decoration:none;
    background:#0d6efd;
    color:white;
    border-radius:5px;
    font-size:17px;
    font-weight:bold;
}

a:hover{
    background:#084298;
}

</style>

</head>

<body>

<div class="container">

<h2>Product Management System</h2>

<a href="add">Add Product</a>

<a href="view">View Products</a>

<a href="search">Search Product</a>

<a href="update">Update Product</a>

<a href="delete">Delete Product</a>

</div>

</body>
</html>