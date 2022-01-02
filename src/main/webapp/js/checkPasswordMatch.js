function checkPasswordMatch() {
	var password = $("#txtNewPassword").val();
	var confirmPassword = $("#txtConfirmPassword").val();
	if (password != confirmPassword)
		$("#CheckPasswordMatch").html("Passwords does not match!");
	else
		$("#CheckPasswordMatch").html("Passwords match.");
}
$(document).ready(function() {
	$("#txtConfirmPassword").keyup(checkPasswordMatch);
});