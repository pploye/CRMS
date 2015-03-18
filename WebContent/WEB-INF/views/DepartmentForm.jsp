<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<section>
<form:form modelAttribute="department">
		<form:errors path="*" id="error" element="div"/>
 		 
           
           <label><spring:message code="departmentId" text="Department ID"/></label>
            <form:input path="departmentId" id="departmentId" />
            
             <label><spring:message code="departmentName" text="Department Name"/></label>
            <form:input path="departmentName" id="departmentName" />
           
          <label><spring:message code="program" text="program"/></label>
            
            
           
           
           
            <input id="submit" type="submit"  value="Add Department">
</form:form>
</section>