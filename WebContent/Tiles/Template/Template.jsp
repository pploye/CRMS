<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<link href="<c:url value="/Resources/Styles/Template.css" />" rel="stylesheet">
	<link href="<c:url value="/Resources/Images/icon.png" />" rel="shortcut icon">
	<link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro' rel='stylesheet' type='text/css'>
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
	<script type="text/javascript" src="<spring:url value="/resource/Scripts/cart.js"/>"></script>
	<title>Aurora (CRMS) Course Registration System</title>
</head>
<body>
	<header>
		<div id="logoArea">
			<h1>Aurora</h1>
		</div>
		<div id="menuArea">
			<a href="terms">Home</a>
			<a href="privacy">Course</a>
			<a href="security">Student</a>
			<a href="contact">Institute</a>
		</div>
	</header>
	<section>
		<div class="dataList">
			<table>
				<thead>
					<tr>
						<td>Name</td>
						<td>Description</td>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>Sample</td>
						<td>This is table sample defination</td>
					</tr>
					<tr>
						<td>Sample</td>
						<td>This is table sample defination</td>
					</tr>
					<tr>
						<td>Sample</td>
						<td>This is table sample defination</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div class="clear"></div>
		<form>
			<div id="error">Sample Error</div>
			<label>First Name: </label>
			<input type="text" size="30"/>
			<label>Last Name: </label>
			<input type="text" size="30"/>
			<label>Gender: </label>
			<input type="text" size="30"/>
			<input type="submit" value="Save"/>
			<input type="reset" value="Clear"/>
			<input type="button" value="Go"/>
		</form>
		<div class="clear"></div>
		<button>Samsple</button>
	</section>
	<footer>
		<div class="formater">
			<div class="copy">&copy; 2015 - 2017, Aurora Inc.</div>
			<a href="terms">Term</a> <a href="privacy">Privacy</a> <a href="security">Security</a> <a href="contact">Contact</a>
		</div>
	</footer>
</body>
</html>