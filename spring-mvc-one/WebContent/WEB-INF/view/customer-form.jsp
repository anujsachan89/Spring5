<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Customer Registation Form</title>
</head>
<style>
.error{color:red}
</style>
<body>

	<form:form action="processForm" modelAttribute="customer">

First Name: <form:input path="firstName" />
		<br>
		<br>
Last Name (*): <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<br>
		<br>
Free Passes (*): <form:input path="freePaases" />
		<form:errors path="freePaases" cssClass="error" />
		<br>
		<br>
		<input type="submit" value="Submit" />
	</form:form>
</body>



</html>