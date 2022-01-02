<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
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
<title>Sign up</title>
</head>
<body>
	<nav
		class="navbar navbar-dark fixed-top bg-primary flex-md-nowrap p-0 shadow">
		<a class="navbar-brand col-sm-3 col-md-2 mr-0" href="#"><h1>Glam-up</h1></a> 
		<input type="text"
			class="form-control form-control-primary w-100"
			placeholder="Search here ..." size="30">
		<ul class="navbar-nav px-3">
			<li class="nav-item text-nowrap">
			<a class="btn btn-primary" href="signUpClick">Sign up</a>
			<a class="btn btn-primary" href="getLoginpage">Login</a>
			</li>
		</ul>
	</nav>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-2 bg-light d-none d-md-block sidebar">
				<div class="left-sidebar">
					<ul class="nav flex-column sidebar-nav">
						<li class="nav-item"><a class="nav-link active" href="#">
								<svg class="bi bi-chevron-right" width="16" height="16"
									viewBox="0 0 20 20" fill="currentColor"
									xmlns="http://www.w3.org/2000/svg">
									<path fill-rule="evenodd"
										d="M6.646 3.646a.5.5 0 01.708 0l6 6a.5.5 0 010 .708l-6 6a.5.5 0 01-.708-.708L12.293 10 6.646 4.354a.5.5 0 010-.708z"
										clip-rule="evenodd" /></svg> Cart
						</a></li>
						<li class="nav-item"><a class="nav-link" href="#"> <svg
									class="bi bi-chevron-right" width="16" height="16"
									viewBox="0 0 20 20" fill="currentColor"
									xmlns="http://www.w3.org/2000/svg">
									<path fill-rule="evenodd"
										d="M6.646 3.646a.5.5 0 01.708 0l6 6a.5.5 0 010 .708l-6 6a.5.5 0 01-.708-.708L12.293 10 6.646 4.354a.5.5 0 010-.708z"
										clip-rule="evenodd" /></svg> Resources
						</a></li>
						<li class="nav-item"><a class="nav-link" href="#"> <svg
									class="bi bi-chevron-right" width="16" height="16"
									viewBox="0 0 20 20" fill="currentColor"
									xmlns="http://www.w3.org/2000/svg">
									<path fill-rule="evenodd"
										d="M6.646 3.646a.5.5 0 01.708 0l6 6a.5.5 0 010 .708l-6 6a.5.5 0 01-.708-.708L12.293 10 6.646 4.354a.5.5 0 010-.708z"
										clip-rule="evenodd" /></svg> WishList
						</a></li>
						<li class="nav-item"><a class="nav-link" href="#"> <svg
									class="bi bi-chevron-right" width="16" height="16"
									viewBox="0 0 20 20" fill="currentColor"
									xmlns="http://www.w3.org/2000/svg">
									<path fill-rule="evenodd"
										d="M6.646 3.646a.5.5 0 01.708 0l6 6a.5.5 0 010 .708l-6 6a.5.5 0 01-.708-.708L12.293 10 6.646 4.354a.5.5 0 010-.708z"
										clip-rule="evenodd" /></svg> Invoices
						</a></li>
						<li class="nav-item"><a class="nav-link" href="#"> <svg
									class="bi bi-chevron-right" width="16" height="16"
									viewBox="0 0 20 20" fill="currentColor"
									xmlns="http://www.w3.org/2000/svg">
									<path fill-rule="evenodd"
										d="M6.646 3.646a.5.5 0 01.708 0l6 6a.5.5 0 010 .708l-6 6a.5.5 0 01-.708-.708L12.293 10 6.646 4.354a.5.5 0 010-.708z"
										clip-rule="evenodd" /></svg> Customer Service
						</a></li>
							<li class="nav-item"><a class="nav-link" href="#"> <svg
									class="bi bi-chevron-right" width="16" height="16"
									viewBox="0 0 20 20" fill="currentColor"
									xmlns="http://www.w3.org/2000/svg">
									<path fill-rule="evenodd"
										d="M6.646 3.646a.5.5 0 01.708 0l6 6a.5.5 0 010 .708l-6 6a.5.5 0 01-.708-.708L12.293 10 6.646 4.354a.5.5 0 010-.708z"
										clip-rule="evenodd" /></svg> Help and Settings
						</a></li>
					</ul>

				</div>
			</div>
			<main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
				
				<hr>
				<div class="row">
					<div class="col-sm-6">
						<div class="card">
							<div class="card-body">
								<h5 class="card-title">Makeup Artist</h5>
							<img alt="Makeup Artist" src="./images/makeup2.jpg" width="400" height="400"><br>
								<a href="#" class="btn btn-primary">Book</a>
							</div>
						</div>
					</div>
					<div class="col-sm-6">
						<div class="card">
							<div class="card-body">
								<h5 class="card-title">Photographer</h5>
							<img alt="Photographer" src="./images/photographer.jpg" width="400" height="400"><br>
								<a href="#" class="btn btn-primary">Book</a>
							</div>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-sm-6">
						<div class="card">
							<div class="card-body">
								<h5 class="card-title">EventPlanner</h5>
								<img alt="EventPlanner" src="./images/eventplanner.jpg" width="400" height="400"><br>
								<a href="#" class="btn btn-primary">Book</a>
							</div>
						</div>
					</div>
					<div class="col-sm-6">
						<div class="card">
							<div class="card-body">
								<h5 class="card-title">Designer</h5>
								<img alt="Designer" src="./images/Designer.jpg" width="400" height="400"><br>
								<a href="#" class="btn btn-primary" >Book</a>
							</div>
						</div>
					</div>
				</div>
			</main>
		</div>

	</div>
</body>
</html>