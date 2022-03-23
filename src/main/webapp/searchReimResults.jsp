<%@ page import="java.util.Iterator"%>
<%@ page import="com.P1.ers.model.User"%>
<%@ page import="java.util.List"%>
<%@ page import="com.P1.ers.model.Reimbursement"%>
<%@ page import="com.P1.ers.dao.ReimbursementDAO"%>
<%@ page import="com.P1.ers.dao.ReimbursementDAOImpl"%>
<%@ page import="com.P1.ers.dao.UserDAO"%>
<%@ page import="com.P1.ers.dao.UserDAOImpl"%><%@ page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<link type="text/css" rel="stylesheet" href="style.css">
<Style>
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
	margin-top: 60px;
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
	border: 1px solid;
	cellspacing: 10;
	cellpadding: 10;
	width: calc(100% - 40px);
}
body{
background-color: #FFDA81;
}
</Style>
</head>
<body>
	<%
	String username = (String) session.getAttribute("username");
	String searchId = request.getParameter("searchId");
	%>
	<%
	ReimbursementDAO reimbursementDAO = new ReimbursementDAOImpl();
	List<Reimbursement> reimbursements = reimbursementDAO.getReimbursementById(searchId);
	Iterator<Reimbursement> iterator = reimbursements.iterator();
	%>

	<nav>
		<div class="nav-user">

			User:
			<%=(username)%>
		</div>
		<a href="welcome.jsp">Home</a><a href="index.jsp">Logout</a> 

	</nav>
<div class="container">
	<div class="title1">Your search results:</div>

	<table class="table table-dark" border="2" cellspacing="10" cellpadding="10">
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
		</tr>
		<%
		}
		%>

	</table>
	</div>
</body>
</html>