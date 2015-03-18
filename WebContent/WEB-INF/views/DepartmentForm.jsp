<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<section>
<form:form modelAttribute="department">
		<form:errors path="*" id="error" element="div"/>
 		 
           
           <label for="departmentId">Department ID: </label>
            <form:input path="departmentId" id="departmentId" />
            
             <label for="departmentName">Department Name</label>
            <form:input path="departmentName" id="departmentName" />
           
           <label for="departmentDescription">Department Description</label>
            <form:input path="departmentDescription" id="departmentDescription" />
            
            
           
           
           
            <input id="submit" type="submit"  value="Add Department">
</form:form>
</section>