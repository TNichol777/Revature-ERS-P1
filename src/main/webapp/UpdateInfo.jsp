<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	cellpadding: 20;
	width: calc(100% - 40px);
}

tr {
	display: inline-flex;
}

body {
	background-color: skyblue;
}

.employment-check {
	display: flex;
	justify-content: space-between;
	align-items: center;
}

.employment-check input {
	margin-right: 15px;
	margin-left: 15px;
}

.button-row {
	width: 100%;
	display: flex;
	justify-content: center;
}

.button-row td {
	width: 100px;
}
</style>
</head>
<body>
	<script type="text/javascript">
		function validateUpdateForm() {

			var password = document.forms[0].elements[1].value;
			var confirmpassword = document.forms[0].elements[2].value;

			}  if (password.length == 0) {
				alert("Please enter password");
				return false;
			} else if (password.length < 6 || password.length > 12){
				alert("Password length must be between 6-12")
					return false;
			
			} else if (password != confirmpassword) {
				alert("passwords do not match");
				return false;
			}
		}
	</script>
	<%
	String username = (String) session.getAttribute("username");
	%>
	<nav>
		<div class="nav-user">

			<h1>User:
			<%=(username)%></h1>
		</div>
		 <a href="welcome-E.jsp">Home</a><a href="index.jsp">Logout</a>

	</nav>
	<div class="container">
		<form class="form-style" action="UpdateInfoController"
			onsubmit="return validateSignUpForm()" name="updateform"
			method="post">
			<table cellpadding="15">
				<tr>
					<td><label> Password: </label></td>
					<td><input type="password" name="password" id="password">
				</tr>
				<tr>
					<td><label> Confirm Password: </label></td>
					<td><input type="password" name="confirmpassword"
						id="comfirmpassword">
				<tr>
				<tr>
					<td><label> First name: </label></td>
					<td><input type="text" name="firstname" id="firstname"></td>
				<tr>
				<tr>
					<td><label> Last name: </label></td>
					<td><input type="text" name="lastname" id="lastname"></td>
				<tr>
					<td><label> Phone: </label></td>
					<td><input type="text" name="phone" id="phone"></td>
				<tr>
				<tr>
					<td><label> Email: </label></td>
					<td><input type="text" name="email" id="email"></td>
				<tr>
				<tr>
					<td><label> Address: </label></td>
					<td><input type="text" name="address" id="address"></td>
				<tr>
				<tr class="button-row">
					<td><input type="submit" value="Update"
						class="btn btn-primary">
					<td><input type="reset" value="clear" class="btn btn-danger"></td>
				</tr>
			</table>
		</form>
		</div>
</body>

</html>