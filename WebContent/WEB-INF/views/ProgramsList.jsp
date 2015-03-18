<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<section>


    <h2>List of Programs</h2>


<table>
		<tr><th>Program Code</th><th>Name</th><th>Description</th></tr>

	<c:forEach var="employee" items = "${employees}">
		<tr>
		<td>${employee.firstName} ${employee.lastName}</td>
		<td>${employee.phones[0].number}</td>
		<td>
		<c:forEach var="address" items="${employee.addresses}" >
     			<c:out value="${address.city}" /><br>
		</c:forEach>
		</td>
		</tr><br>
	</c:forEach>
</table>  
</section>