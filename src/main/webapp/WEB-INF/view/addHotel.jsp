<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
<style>
td {
	padding-right: 50px;
}
</style>
</head>

<body>
	<div class="container">
		<table class="table-responsive">
			<tr>
				<td><a href="<c:url value="/homepage"/>">Hotels</a></td>
				<td><a href="<c:url value="/addHotelForm"/>">Add a hotel</a></td>
				<td><a href="#">find by price</a></td>
				<td><a href="#">find by price</a></td>
			</tr>
		</table>
		<!-- action="<c:url value="/homepage"/>" -->
		
		<form id="newHotelForm">
			<div class="form-group row">
				<label for="hotelName" class="col-2 col-form-label">Hotel:</label>
				<div class="col-10">
					<input type="text" id="hotelName">
				</div>
			</div>
		
			<div class="form-group row">
				<label for="price" class="col-2 col-form-label">Price:</label>
				<div class="col-10">
					<input type="number" id="pricePerNight">
				</div>
			</div>
		
			<div class="form-group row">
				<label for="city" class="col-2 col-form-label">City:</label>
				<div class="col-10">
					<input type="text" id="city" />
				</div>
			</div>
		
			<div class="form-group row">
				<label for="country" class="col-2 col-form-label">Country:</label>
				<div class="col-10">
					<input type="text" id="country" />
				</div>
			</div>
			
			<button type="button" onclick="addHotel()">Submit</button>
		</form>
	</div>









	<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/addHotel.js"></script>
</body>
</html>