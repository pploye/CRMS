<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<section>
	<div class="dataList">
		<table>
			<thead>
				<tr>
					<td>ID Number</td>
					<td>First Name</td>
					<td>Last Name</td>
					<td>Gender</td>
					<td>Date of Birth</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${studentslist}" var="element">
					<tr>
						<td>${element.firstName}</td>
						<td>${element.lastName}</td>
						<td>${element.gender}</td>
						<td>${element.dateOfBirth}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</section>