<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<section>


	<label>A new Program has been added</label>
		<label for="programId">Program ID: ${program.programId} </label> 
		
		<label for="programTitle">Title : ${program.programTitle}</label> 
		<label for="description">Description: ${program.description}</label>
		
		
		<c:forEach items="${program.accademicYears}" var="accademicyear"  >
       
                Academic Year: ${accademicyear.name}  <br/>
                Start Date: ${accademicyear.startDate}<br/>
                End Date : ${accademicyear.endDate }
        </c:forEach>
</section>