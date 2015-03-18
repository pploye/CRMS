<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<section>
<form:form modelAttribute="department">
		<form:errors path="*" id="error" element="div"/>
 		 
           
           <label for="id">Department ID</label>
            <form:input path="id" id="id" />
            
             <label for="name">Department Name</label>
            <form:input path="name" id="name" />
           
           <label for="description">Department Description</label>
            <form:input path="description" id="description" />
            
            
           
           
           
            <input id="submit" type="submit"  value="Add Department">
</form:form>
</section>