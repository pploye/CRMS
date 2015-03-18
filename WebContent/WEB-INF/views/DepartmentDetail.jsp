<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<section>

		<label>A new Department has been added</label>
		<label for="departmentId">Department ID: ${department.departmentId} </label> 
		
		<label for="departmentName">Department Name : ${department.departmentName}</label> 
		<label for="departmentDescription">Department Description: ${department.departmentDescription}</label>

</section>