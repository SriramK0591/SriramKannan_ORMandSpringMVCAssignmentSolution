<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<title>Customer MVC</title>
</head>
<body style="background-color: #d3d3d3">
<div class="container mt-5">
<h1 align="center" style="font-weight: bold; ">CUSTOMER RELATIONSHIP MANAGEMENT</h1>
<a href="customerform" class="btn btn-primary" style="font-weight: bold;">Add New Customer</a>
<table class="table mt-5 table-light ">
<caption>List of Customers</caption>
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">First Name</th>
      <th scope="col">Last Name</th>
      <th scope="col">Email</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="customer" items="${list}">
    <tr>
      <th scope="row"><c:out value="${customer.id }"/></th>
      <td><c:out value="${customer.firstname}"/></td>
      <td><c:out value="${customer.lastname}"/></td>
      <td><c:out value="${customer.email}"/></td>
      <td><a href="editcustomerform/<c:out value="${customer.id}"/>" class="btn btn-warning">Edit</a>
      <a href="deletecustomer/<c:out value="${customer.id}"/>" class="btn btn-danger">Delete</a>
      </td>

    </tr>
    </c:forEach>
  </tbody>
</table>
</div>

</body>
</html>