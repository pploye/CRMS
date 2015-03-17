<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<link href="<c:url value="/Resources/Styles/Template.css" />" rel="stylesheet">
	<link href="<c:url value="/Resources/Images/icon.png" />" rel="shortcut icon">
	<link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro' rel='stylesheet' type='text/css'>
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
	<script type="text/javascript" src="<spring:url value="/Resources/Scripts/Script.js"/>"></script>
	<title><tiles:insertAttribute name="title"/></title>
</head>
<body>
	<tiles:insertAttribute name="header"/>
	<tiles:insertAttribute name="content"/>
	<tiles:insertAttribute name="footer"/>
</body>
</html>