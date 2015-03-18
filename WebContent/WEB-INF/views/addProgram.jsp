<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<section>
	<form:form  comandName= "newProgram">
	
		<form:errors path="*"/>
		
		<label for="ProgramCode" >Program Code:</label>
		<form:input path="ProgramCode"/>
		
		<label for="ProgramName" >Program Name:</label>
		<form:input path="name"/>
		
		<label for="ProgramDescription">Program Description</label>
		<form:input path ="description"/>
	</form:form>
</section>