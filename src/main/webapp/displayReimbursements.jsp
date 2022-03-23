<%@ page import="java.util.Iterator"%>
<%@ page import="com.P1.ers.model.User"%>
<%@ page import="com.P1.ers.model.Reimbursement"%>
<%@ page import="java.util.List"%>
<%@ page import="com.P1.ers.dao.ReimbursementDAO"%>
<%@ page import="com.P1.ers.dao.ReimbursementDAOImpl"%>
<%@ page import="com.P1.ers.dao.UserDAO"%>
<%@ page import="com.P1.ers.dao.UserDAOImpl"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reimbursement Requests</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<link type="text/css" rel="stylesheet" href="style.css">
<style>
.container {
	padding: 60px;
	position: relative;
	width: calc(100% - 120px);
	height: 100vh;
	z-index: 1;
}

.nav-user {
	justify-content: flex-start;
	padding-left: 15px;
	width: calc(100% - 60px);
	display: flex;
	color: white;
}

.title {
	justify-content: center;
	margin: 0 auto;
	width: calc(100% - 60px);
	display: flex;
	color: white;
	font-size: 30px;
}

.title1 {
	justify-content: center;
	margin: 0 auto;
	width: calc(100% - 60px);
	display: flex;
	color: black;
	font-size: 30px;
}

.menu {
	display: flex;
	justify-content: flex-start;
	margin-top: 25px;
	padding: 30px;
	width: calc(100% - 91px);
	display: flex;
	background-color: #333;
	border-radius: .5rem;
	overflow: hidden;
}

li a {
	text-decoration: none;
	border-radius: .25rem;
	padding: 10px;
	color: white;
	margin-right: 15px;
	text-align: center;
	font-size: 28px;
	font-weight: 600px;
}

li {
	margin-top: 10px;
}

ul {
	list-style-type: none;
	margin: 0;
	padding: 0px;
	color: white;
}

nav {
	display: flex;
	justify-content: flex-end;
	position: absolute;
	top: 0;
	left: 0;
	height: 60px;
	width: 100vw;
	background-color: black;
	z-index: 2;
}

nav a {
	padding-right: 70px;
	padding-top: 25px;
	color: white;
	text-decoration: none;
	font-size: 18px;
	cursor: pointer;
}

nav a:hover {
	color: blue;
}

table, th, td {
	border: none;
	cellspacing: 10;
	cellpadding: 5;
	width: calc(100% - 40px);
}
body{
background-color: #FFDA81;
}
</style>
</head>

<%
ReimbursementDAO reimbursementDAO = new ReimbursementDAOImpl();
List<Reimbursement> reimbursements = reimbursementDAO.getReimbursement();
Iterator<Reimbursement> iterator = reimbursements.iterator();
%>
<body>
	<%
	String username = (String) session.getAttribute("username");
	%>
	<nav>
		<div class="nav-user">

			<h1>
				User:
				<%=(username)%></h1>
		</div>
		<a href="welcome.jsp">Home</a><a href="index.jsp">Logout</a>

	</nav>
	<div class="container">

		<div class="title1">
			<h1>Reimbursement Requests</h1>
		</div>
		<div>

			<table class="table table-dark">
				<th>User Id</th>
				<th>Amount</th>
				<th>Purpose</th>
				<th>Status</th>
				<%
				while (iterator.hasNext()) {
					Reimbursement reimbursement = iterator.next();
				%>
				<tr>
					<td><%=reimbursement.getUserId()%></td>
					<td><%=reimbursement.getAmount()%></td>
					<td><%=reimbursement.getPurpose()%></td>
					<td><%=reimbursement.getStatus()%></td>
					<td>
						<button type="submit" value="approve" class="btn btn-success">Approve</button>


						<button type="submit" value="decline" class="btn btn-danger">Decline</button>
					</td>
				</tr>
				<%
				}
				%>
			</table>

		</div>
	</div>
</body>
</html>