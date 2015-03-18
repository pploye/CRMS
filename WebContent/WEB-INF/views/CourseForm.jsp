<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<section>
<form:form modelAttribute="course">
		<form:errors path="*" id="error" element="div"/>
		
		<label><spring:message code="course.courseId" text= ""/></label>
		<form:input type="text" path="courseId"/>
		
		<label><spring:message code="course.name" /></label>
		<form:input path="name" />
		
		<label><spring:message code="course.description" text="description"/></label>
		<form:input path="description" />
		
		
		
		<label><spring:message code="course.startDate" text="startDate"/></label>
		<form:input path="startDate"/>
		
		<label><spring:message code="course.endDate" text="endDate"/></label>
		<form:input path="endDate"/>
		
		
		<input type="submit" value="<spring:message code="course.add" text="Add Course"/>"/>
	</form:form>
</section>