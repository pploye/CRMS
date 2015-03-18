<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<section>
	<form:form commandName="editaddress" action="profile">
		<form:errors path="*" id="error" element="div"/>
		
		<label><spring:message code="address.street" text="Street"/></label>
		<form:input path="street"/>
		
		<label><spring:message code="address.city" text="City"/></label>
		<form:input path="city" />
		
		<label><spring:message code="address.state" text="State"/></label>
		<form:input path="state" />
		
		<label><spring:message code="address.zipCode" text="Zip Code"/></label>
		<form:input path="zipCode" />
		
		<label><spring:message code="address.website" text="Website"/></label>
		<form:input path="website"/>
		
		<label><spring:message code="address.phoneNumber" text="Phone Number"/></label>
		<form:input path="phoneNumber"/>
		
		<label><spring:message code="address.fax" text="Fax"/></label>
		<form:input path="fax"/>
		
		
		
		<input type="reset" value="<spring:message code='clear' text='Clear'/>" />
		<input type="submit" value="<spring:message code='update' text='Update'/>" />
	</form:form>
</section>