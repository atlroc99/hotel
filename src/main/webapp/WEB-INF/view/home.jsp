<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
/* var jsonResponse = {json:JSON.stingify(contents)}; */

$.ajax({
	type: 'GET',
	url:'http://localhost:9000/hotels/allHotels',
	success: function(hotels){
		//hotels = JSON.parse(hotels);
		
	$.each(hotels, function(i, hotel){
		var logText = 
			"ID: " + hotel.id + "\n" +
			"Name: " + hotel.name +"\n"+
			"Price: " + hotel.pricePerNight + "\n" + 
			"Address: \n" +
			"	City: " + hotel.address.city + "\n" +
			"	Country" + hotel.address.country + "\n" +
			"Reviews: " + "\n" + 
			 $.each(hotel.list, function(i, review){
				 "Guest: " + review.name + "\n" + 
				 "Rating: " + review.rating + "\n" + 
				 "Approved: " + review.approved+ "\n"
			 });
		
		console.log(logText);
		});
	}
});

//create a new method to print the reviews only 
//another test

</script>
</head>
<body>

<h2>Hotels com -> landing page for the hotels</h2>
<div id="div1"></div>

<button>Click to get Data</button>
</body>
</html>