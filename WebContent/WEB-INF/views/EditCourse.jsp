<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<section>
	<form:form modelAttribute="editcourse">
		<form:errors path="*" id="error" element="div" />
		<label for="Course ID"> </label>
		<form:input path="courseId" />

		<label for="courseId">Course ID</label>
		<form:input path="courseId" id="courseId" />

		<label for="name">Course Name</label>
		<form:input path="name" id="name" />

		<label for="description">Course Description</label>
		<form:input path="description" id="description" />

		<label for="startDate">Course Starting Date</label>
		<form:input path="startDate" id="startDate" />

		<label for="endDate">Course Ending Date</label>
		<form:input path="endDate" id="endDate" />



		<input id="submit" type="submit" value="Edit Course">
	</form:form>
</section>