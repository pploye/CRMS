<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<section>
	<form:form modelAttribute="student">
		<form:errors path="*" id="error" element="div"/>
		
		<label><spring:message code="student.id" text= "ID"/></label>
		<form:input type="text" path="sId"/>
		
		<label><spring:message code="student.firstname" /></label>
		<form:input path="sFirstName" />
		
		<label><spring:message code="student.lastname" text="lastname"/></label>
		<form:input path="sLastName" />
		
		<label><spring:message code="student.gender" text="gender"/></label>
		<form:radiobutton path="gender" value="M" label="M" />
		<form:radiobutton path="gender" value="F" label="F" />
		
		<label><spring:message code="student.birthdate" text="birthdate"/></label>
		<form:input path="dateOfBirth"/>
		
		<input type="submit" value="Update Profile"/>
	</form:form>
</section>