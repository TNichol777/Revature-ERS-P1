<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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

body {
	backgound-color: #FFDA81;
}

</style>
</head>
<body>
	<%
	String username = (String) session.getAttribute("username");
	%>
	<script type="text/javascript">
		function validateReimbursementForm() {
			var amount = document.getElementById("amount").value;
			var purpose = document.signupform.qualification.options.selectedIndex;
			if (amount.length == 0) {
				alert("Please enter amount");
				return false;
			} else if (purpose == 0) {
				alert("Please select a purpose");
				return false;
			} 
	</script>
	<nav>
		<div class="nav-user">

			<h1>
				User:
				<%=(username)%></h1>
		</div>
		 <a href="welcome-E.jsp">Home</a><a href="index.jsp">Logout</a>
	</nav>
	<div class="container">
		<div class="title1"><h1>Reimbursement Request</h1></div>
		<form class="form-style" action="ReimbursementController"
			onsubmit="return validateReimbursementForm()"
			name="reimbursementform" method="get">
			<table>
				<tr>
					<td><label> Amount: </label></td>
					<td><input type="text" name="amount" id="amount"></td>
				<tr>
					<td><label> Purpose: </label></td>
					<td><select name="purpose" id="purpose">
							<option>--select--</option>
							<option>Continued Education</option>
							<option>Travel Accommodations</option>
							<option>Transportation</option>
							<option>Mileage</option>
							<option>Air fare</option>
							<option>Medical</option>
							<option>Food</option>
							<option>Entertainment</option>
					</select></td>
				</tr>


				<tr class="button-row">
					<td><input type="submit" value="Request"
						class="btn btn-primary">
					<td><input type="reset" value="clear" class="btn btn-danger"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>