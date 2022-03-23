<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link type="text/css" rel="stylesheet" href="style.css">
<style>
.container {
	padding: 60px;
	position: relative;
	width: calc(100% - 120px);
	height: 100vh;
	z-index: 1;
}

.title {
	justify-content: center;
	margin: 0 auto;
	width: calc(100% - 60px);
	display: flex;
}
.nav-user {
	justify-content: flex-start;
	padding-left: 15px;
	width: calc(100% - 60px);
	display: flex;
	color: white;
}

.menu {
	display: flex;
	justify-content: flex-start;
	margin-top: 25px;
	padding:30px;
	width: calc(100% - 91px);
	display: flex;
	background-color:#333;
	border-radius: .5rem;
	overflow:hidden;
}

li a {
	text-decoration: none;
	border-radius: .25rem;
	padding: 10px;
	color: white;
	margin-right: 15px;
	text-align:center;
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
body{
background-color:#FFDA81;
}

</style>
</head>
<body>
	<%
	String employment = (String) session.getAttribute("employment");
	String username = (String) session.getAttribute("username");
	%>
	<nav>
		<a href="index.jsp">Logout</a>
	</nav>
	<div class="container">
		<div class="title">
			<h1>
				Welcome,
				<%=(username)%></h1>
		</div>
		<div class="menu">
			<ul>
				<li><a href="displayReimbursements.jsp">View Reimbursement Requests</a></li>
				<li><a href="displayResolvedReim.jsp">View Resolved	Reimbursement</a></li>
				<li><a href="searchUserReim.jsp">Search Reimbursements</a></li>
				<li><a href="displayUserDetails.jsp">View Employees</a></li>
				<li><a href="searchUser.jsp">Search Employees</a></li>
			</ul>
		</div>

	</div>
</body>
</html>