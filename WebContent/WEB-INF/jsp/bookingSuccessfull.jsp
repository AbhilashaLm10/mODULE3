<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Booking Successful</title>
</head>
<body>
<form:form modelAttribute="hotel" action="hotelDetails.obj"
			method="post">
			<h2><label style="color: blue;">Successfully booked </label><label style="color: blue;">"${hotel.name}"</label></h2>
			<td colspan=2>
					<button type="submit">Home page</button>
				</td>
		</form:form>

</body>
</html>