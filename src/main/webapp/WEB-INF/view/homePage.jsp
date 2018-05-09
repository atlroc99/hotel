<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="header.html"%>


<div id="container-fluid">

	<table class="table-responsive">
		<tr>
			<td><a href="<c:url value="/homepage"/>">Hotels</a></td>
			<td><a href="<c:url value="/addHotelForm"/>">Add a hotel</a></td>
			<td><a href="#">find by price</a></td>
			<td><a href="#">find by price</a></td>
		</tr>
	</table>
	<div class="table-responsive">
		<table class="table table-bordered" id="hotel_table">
			<tr>
				<th>Name</th>
				<th>Price per Night</th>
				<th>City</th>
				<th>Country</th>
			</tr>
		</table>
	</div>
</div>


<%@include file="footer.html"%>