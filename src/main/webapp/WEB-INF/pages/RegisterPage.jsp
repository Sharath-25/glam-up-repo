<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link rel="stylesheet" href="./css/dashboard.css">
<link rel="stylesheet" href="./css/signup.css">
<title>Sign up</title>
</head>
<body>
	<nav
		class="navbar navbar-dark fixed-top bg-primary flex-md-nowrap p-0 shadow">
		<a class="navbar-brand col-sm-3 col-md-2 mr-0" href="#"><h1>Glam-up</h1></a>
		<ul class="navbar-nav px-3">
			<li class="nav-item text-nowrap">
			<a class="btn btn-primary" href="getLoginpage">Login</a></li>
		</ul>
	</nav>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<section class="vh-100">
		<div class="container-fluid">
			<div class="row">
				<div class="col-sm-6 text-black">

					<div
						class="d-flex align-items-center h-custom-2 px-5 ms-xl-4 mt-5 pt-5 pt-xl-0 mt-xl-n5">
						<c:url var="actionUrl" value="/register/vendor" />

						<form:form style="width: 23rem; " action="${actionUrl}"
							modelAttribute="vendorRegisterDTO" method="POST"
							acceptCharset="UTF-8">
							<h3 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Vendor
								Registration Form</h3>
								<h3 style="color: green">${registerMessage}</h3>
							<div class="form-outline mb-4">
								<form:label path="businessType">Business Type</form:label>
								<form:select path="businessType"
									class="form-control form-control-lg">
									<form:option value="" label="--- Select ---" />
									<form:option value="MAKEUPARTIST" label="Makeup Artist" />
									<form:option value="PHOTOGRAPHER" label="Photographer" />
									<form:option value="EVENTPLANNER" label="Event Planner" />
									<form:option value="DESIGNER" label="Designer" />
								</form:select>
								<form:errors path="businessType" cssClass="error"
									style="color: red" />
							</div>
							<div class="form-outline mb-4">
								<form:label path="firstName">FirstName</form:label>
								<form:input path="firstName"
									class="form-control form-control-lg" />
								<form:errors path="firstName" cssClass="error"
									style="color: red" />
							</div>
							<div class="form-outline mb-4">
								<form:label path="lastName">LastName</form:label>
								<form:input path="lastName" class="form-control form-control-lg" />
								<form:errors path="lastName" cssClass="error" style="color: red" />
							</div>
							<div class="form-outline mb-4">
								<form:label path="email">Email</form:label>
								<form:input path="email" class="form-control form-control-lg" />
								<form:errors path="email" cssClass="error" style="color: red" />
							</div>
							<div class="form-outline mb-4">
								<form:label path="mobileNo">MobileNo</form:label>
								<form:input path="mobileNo" class="form-control form-control-lg" />
								<form:errors path="mobileNo" cssClass="error" style="color: red" />
							</div>
							<div class="form-outline mb-4">
								<form:label path="password">Password</form:label>
								<form:password path="password"
									class="form-control form-control-lg" name="pass"
									id="txtNewPassword" />
								<form:errors path="password" cssClass="error" style="color: red" />
							</div>
							<div class="form-outline mb-4">
								<form:label path="confirmPassword">Confirm Password</form:label>
								<form:password path="confirmPassword"
									class="form-control form-control-lg" id="txtConfirmPassword"
									name="confpass" />
								<form:errors path="confirmPassword" cssClass="error"
									style="color: red" />
								<div class="registrationFormAlert" style="color: green;"
									id="CheckPasswordMatch"></div>
								<script src="./js/checkPasswordMatch.js"></script>
							</div>
							<div class="form-outline mb-4">
								<form:label path="address">Address</form:label>
								<form:textarea path="address"
									class="form-control form-control-lg" />
								<form:errors path="address" cssClass="error" style="color: red" />
							</div>
							<div class="form-outline mb-4">
								<form:label path="bioData">Biodata</form:label>
								<form:textarea path="bioData"
									class="form-control form-control-lg" />
								<form:errors path="bioData" cssClass="error" style="color: red" />
							</div>
							<form:button class="btn btn-info btn-lg btn-block"
								id="RegisterPage">REGISTER VENDOR </form:button>
							<br>
							<p>
								already have an account? <a href="#!" class="link-info">Login
									here</a>
							</p>

						</form:form>
					</div>

				</div>
				<div class="col-sm-6 px-0 d-none d-sm-block">
					<div class="row">
						<strong>Thank you for your interest in becoming a
							vendor/supplier for us. If you wish to apply for this status,
							please fill out this online Vendor Registration Form.</strong>
					</div>
				</div>


			</div>
	</section>
</body>
</html>