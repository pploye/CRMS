<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form:form commandName="institute" action="institute_save" method="post">



		<form:errors path="*" />
		
		<label for="name">Institute Name: </label>
		<form:input path="name" />

		<input type="reset" value="Reset">
		<input type="submit" value="Add Institute">


	</form:form>

</body>
</html>