<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title></title>

	<!-- Bootstrap -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha/css/bootstrap.min.css">
	<style>
		td{
			padding-right: 50px;
		}
	</style>

	<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.2/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
</head>

<body>
	<div id="container-fluid">
		<h2>Hotels com -> landing page for the hotels</h2>


<table class="table-responsive">
	<tr>
		<td>
			<a href="homePage.html" onclick="homePage()">Hotels</a>
		</td>
			<td>
				<a href="addHotel.html">Add a hotel</a>
			</td>
			<td>
				<a href="#">find by price</a>
			</td>
			<td>
				<a href="#">find by price</a>
			</td>
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

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/hotelHome.js"></script>
</body>

</html>
