<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<section>
	<div class="dataList">
		<table>
			<thead>
				<tr>
					<td>Name</td>
					<td>Description</td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Sample</td>
					<td>This is table sample defination</td>
				</tr>
				<tr>
					<td>Sample</td>
					<td>This is table sample defination</td>
				</tr>
				<tr>
					<td>Sample</td>
					<td>This is table sample defination</td>
				</tr>
			</tbody>
		</table>
	</div>
	<div class="clear"></div>
	<form>
		<div id="error">Sample Error</div>
		<label>First Name: </label>
		<input type="text" size="30"/>
		<label>Last Name: </label>
		<input type="text" size="30"/>
		<label>Gender: </label>
		<input type="text" size="30"/>
		<input type="submit" value="Save"/>
		<input type="reset" value="Clear"/>
		<input type="button" value="Go"/>
	</form>
	<div class="clear"></div>
</section>