<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<section>
<form:form modelAttribute="editdepartment">
		<form:errors path="*" id="error" element="div"/>
 		 
           
           <label><spring:message code="departmentId" text="Department ID"/></label>
            <form:input path="departmentId" id="departmentId" />
            
             <label><spring:message code="departmentName" text="Department Name"/></label>
            <form:input path="departmentName" id="departmentName" />
            
             <label><spring:message code="departmentDescription" text="Department Description"/></label>
            <form:input path="departmentDescription" id="departmentDescription" />
           
          <label><spring:message code="program" text="program"/></label>
           	<form:select id="" path="registeredCourses" items="${courses}" itemLabel="name" itemValue="courseId"/>
           
            
           <input type="submit" value="<spring:message code="department.add" text="Add Department"/>"/>
           
           
           
</form:form>
</section>