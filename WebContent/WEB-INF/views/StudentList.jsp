<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<section>
	<div class="dataList">
		<table>
			<thead>
				<tr>
					<td>First Name</td>
					<td>Last Name</td>
					<td>Gender</td>
					<td>Date of Birth</td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${student.firstName}</td>
					<td>${student.lastName}</td>
					<td>${student.gender}</td>
					<td>${student.dateOfBirth}</td>
				</tr>
			</tbody>
		</table>
	</div>
</section>