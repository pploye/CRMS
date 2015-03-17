<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link href="<c:url value="/Resources/Styles/Template.css" />" rel="stylesheet">
	<link href="<c:url value="/Resources/Images/icon.png" />" rel="shortcut icon">
	<link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro' rel='stylesheet' type='text/css'>
	<title>Aurora (CRMS) Course Registration System</title>
</head>
<body>
	<header>
		<div id="logoArea">
			<img src="<c:url value="/Resources/Images/icon.png" />" alt="logo"/>
		</div>
		<div id="menuArea">
			<a href="terms">Term</a> <a href="privacy">Privacy</a> <a href="security">Security</a> <a href="contact">Contact</a>
		</div>
	</header>
	<section>
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
		<form>
			<div id="error">Sample Error</div>
			<label>First Name: </label>
			<input type="text" size="30"/>
			<label>Last Name: </label>
			<input type="text" size="30"/>
			<label>Gender: </label>
			<input type="text" size="30"/>
			<input type="submit" value="Save"/>
			<input type="reset" value="Cancle"/>
			<input type="button" value="Go"/>
		</form>
	</section>
	<footer>
		<a href="terms">Term</a> | <a href="privacy">Privacy</a> | <a href="security">Security</a> | <a href="contact">Contact</a>
		<p>&copy; 2015 - 2017 Aurora Inc. All rights reserved.</p>
	</footer>
</body>
</html>