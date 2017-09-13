/**
 *
 */

 function _homePage() {
	 $.ajax({
		 type:'GET',
		 url:'http://localhost:9000/homepage',
		 success:function(){
			 success;
		 }
	 });
 }
 
 
var jsonFile = "js/info.json";

$(document).ready(function() {
	$.getJSON(jsonFile, function(data) {
		var employee = '';
		var tags ='';
		var friends = '';
		$.each(data, function(i, value) {
			employee += '<tr>';
			employee += '<td>' + value.name + '</td>';
			employee += '<td>' + value.gender + '</td>';
			employee += '<td>' + value.eyeColor + '</td>';

			tags = value.tags;
			employee += '<td>'+tags +'</td>';

			var f = '';
			$.each(value.friends, function(k, friend){
				f += friend.name;
				f += ', ';
				console.log(friend.name);
			});

			employee += '<td>'+ f +'</td>'

			employee += '</tr>';
		});
		// console.log(employee);
		$('#info_table').append(employee);
	});
});

function printHotels() {
	var tableContent = "<table>"
	$.ajax({
		type : 'GET',
		url : 'http://localhost:9000/hotels/allHotels',
		success : function(hotels) {
			$.each(hotels, function(i, hotel) {
				tableContent += '<tr><td>' + hotel.name + '</td></tr>'

				var htl = "Hotel: " + hotel.name + "\nPrice per night: "
						+ hotel.pricePerNight + "\nAddress: " + "\n	city: "
						+ hotel.address.city + "\n 	country: "
						+ hotel.address.country;

				console.log(htl);
				$.each(hotel.list, function(j, review) {
					var reviews = "\nGuest: " + review.userName + '\nRating: '
							+ review.rating + '\nApproved: ' + review.approved;

					console.log(reviews);
				});
			});
		}
	});

	$('#hotelTable').append(tableContent);
}
