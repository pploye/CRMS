<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<section>
	<form:form commandName="student" action="profile">
		<form:errors path="*" id="error" element="div"/>
		
		<label><spring:message code="student.id" text="ID Number"/></label>
		<form:input path="studentId"/>
		
		<label><spring:message code="student.firstName" text="First Name"/></label>
		<form:input path="firstName" />
		
		<label><spring:message code="student.lastName" text="Last Name"/></label>
		<form:input path="lastName" />
		
		<label><spring:message code="student.gender" text="Gender"/></label>
		<form:select path="gender">
			<form:option label="Select Gender" value="0"/>
			<form:option label="Male" value="Male"/>
			<form:option label="Female" value="Female"/>
		</form:select>
		
		<label><spring:message code="student.dateOfBirth" text="BirthDate"/></label>
		<form:input path="dateOfBirth"/>
		
		<input type="reset" value="<spring:message code='student.clear' text='Clear'/>" />
		<input type="submit" value="<spring:message code='student.update' text='Update'/>" />
	</form:form>
</section>