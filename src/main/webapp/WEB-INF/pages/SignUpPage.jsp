<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
	integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link rel="stylesheet" href="./css/dashboard.css">
<link rel="stylesheet" href="./css/login.css">
<title>Sign up</title>
</head>
<body>
	<nav
		class="navbar navbar-dark fixed-top bg-primary flex-md-nowrap p-0 shadow">
		<a class="navbar-brand col-sm-3 col-md-2 mr-0" href="#"><h1>Glam-up</h1></a>
		<a class="navbar-brand col-sm-3 col-md-2 mr-0" href="./index.jsp">Home</a>
		<ul class="navbar-nav px-3">
			<li class="nav-item text-nowrap"><a class="btn btn-primary"
				href="getLoginpage">Login</a></li>
		</ul>
	</nav>
	<section class="vh-100">
		<div class="container-fluid">
			<div class="row">
				<div class="col-sm-6 text-black">
					<div>
						<br> <br>
						<br> <br><br> <br>
					</div>
					<div
						class="d-flex align-items-center h-custom-2 px-5 ms-xl-4 mt-5 pt-5 pt-xl-0 mt-xl-n5">

						<form style="width: 23rem;" action="getEmail" method="post">

							<h3 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Register
								or Sign Up</h3>
							<h6>An OTP will be sent to your Email ID for verification</h6>
							<div class="form-outline mb-4">
								<input name="email" type="email" id="form2Example17"
									class="form-control form-control-lg"
									placeholder="Enter your email" />
								<p style="color: red">${message}</p>
							</div>
							<div class="pt-1 mb-4">
								<button class="btn btn-info btn-lg btn-block">Get OTP</button>
							</div>
							<p>
								already have an account? <a href="getLoginpage"
									class="link-info">Login here</a>
							</p>

						</form>

					</div>

				</div>
				<div class="col-sm-6 px-0 d-none d-sm-block">
				<br><br><br>
				<img alt="EventPlanner" src="./images/eventplanner.jpg" width="400" height="250"><br>
				<img alt="Makeup Artist" src="./images/Designer.jpg" width="400" height="250"><br>
				
				</div>
			
				
			
			</div>
		</div>
	</section>
</body>
</html>