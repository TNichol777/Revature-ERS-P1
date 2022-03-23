<!DOCTYPE html>
<html>
<meta charset="UTF-8">
<title>Home Page</title>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<link type="text/css" rel="stylesheet" href="style.css">
<!-- Note: My style sheet has not been working and I had to style each page individually. -->
<style>
.container{
padding: 60px;
position:relative;
width: 100vw;
height: 100vh;
}
.title{
justify-content: center;

margin: 0 auto;
width: 100%;
display: flex;

}
.login{
justify-content: center;
margin: 0 auto;
margin-top: 25px;
width: 100%;
display: flex;
}
.date{
position:absolute;
bottom: 10px;
right: 0px;
}
.login a{
text-decoration: none;
border-radius:.25rem;
background-color: red;
padding: 10px;
color: white;
margin-right: 15px;
box-shadow: 0px 8px 15px rgba(0, 0, 0, 0.1);
}
body{
background-color: #FFDA81;
}


</style>
</head>
<body>
	<div class="container">
		<div class="title">
			<h3>Revature - ERS</h3>
		</div>
		<div class="login">
			<a href="login1.html">Login</a> 
			<a href="signUp.html">Sign Up</a>
		</div>
		<div class="date">
			<%out.println(new java.util.Date());%>
		</div>
	</div>




</body>
</html>
