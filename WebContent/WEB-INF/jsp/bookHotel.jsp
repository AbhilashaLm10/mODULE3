<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute = "hotel">
	<label>Best Viewed in Chrome for selecting dates </label><br>
	<label>Book </label><label>${hotel.name}</label><br>
	</form:form>
	
	<table>
		<form:form modelAttribute="bookingDetails" action="saveBooking.obj"
			method="post">
			<tr align="center">
				<td colspan=2><h3>Enter your details</h3></td>
			</tr>
			
		
			
			<tr>
				<td><label for="name">Name</label></td>
				<td><form:input path="customerName" id="name"
						placeholder="Name" />
				<lebel><form:errors path="customerName"></form:errors></lebel>
				</td>
			</tr>
			<tr>
				<td><label for="hotelId">Hotel Id</label></td>
				<td><form:input path="hotelId" id="hotelId"
						placeholder="Hotel Id" value="${bookingDetails.hotelId}" />
				<lebel><form:errors path="hotelId"></form:errors></lebel>
				</td>
			</tr>
			
			<tr>
				<td><label for="fromdate">Booking From</label></td>
				<td><form:input type="date" path="fromdate" id="fromdate"
						placeholder="From Date" />
				</td>
			</tr>
			
			<tr>
				<td><label for="todate">Check out</label></td>
				<td><form:input type="date" path="todate" id="todate"
						placeholder="To Date" />
				</td>
			</tr>
			
			<tr>
				<td><label for="noofrooms">No of Rooms</label></td>
				<td><form:input path="noofrooms" id="noofrooms"
						placeholder=" give between 1-5" />
				<lebel><form:errors path="noofrooms"></form:errors></lebel>
				</td>
			</tr>
			
			<tr>
				<td colspan=2>
					<button type="submit">Book</button>
				</td>
			</tr>
			<c:if test="${message ne null}">
				<tr align="center">
					<td colspan=2><label style="color: blue;">"${message}"</label></td>
				</tr>
			</c:if>

		</form:form>
	</table>
</body>
</html>