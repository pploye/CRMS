<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<section>
<form:form modelAttribute="professor">
		<form:errors path="*" id="error" element="div"/>
		
		<label><spring:message code="professor.professorId" text= "Professor ID"/></label>
		<form:input type="text" path="professorId"/>
		
		<label><spring:message code="professor.firstName"  text= "Professor FirstName"/></label>
		<form:input path="firstName" />
		
		<label><spring:message code="professor.lastName" text="Professor LastName"/></label>
		<form:input path="lastName" />
		
		<label><spring:message code="professor.gender" text="Gender"/></label>
		<form:select path="gender">
			<form:option label="Select Gender" value="0"/>
			<form:option label="Male" value="Male"/>
			<form:option label="Female" value="Female"/>
		</form:select>
		
		<label><spring:message code="professor.educationLevel" text="Educational Level"/></label>
		<form:input path="educationLevel"/>
		
		
		
		<input type="submit" value="<spring:message code="professor.add" text="Add Professor"/>"/>
	</form:form>
</section>