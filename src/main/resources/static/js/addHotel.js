$(function() {
	console.log("hello..testing..testing..");
});

function addHotel() {
	console.log("hello testing");

	var $name = $("#hotelName");
	var $pricePerNight = $("#pricePerNight");
	var $city = $("#city");
	var $country = $("#country");

	console.log('Name: ' + $name.val() + ' PricePerNight: '
			+ $pricePerNight.val() + ' City: ' + $city.val() + ' Country:'
			+ $country.val());
	
	var newHotel = {
		name : $name.val(),
		pricePerNight:$pricePerNight.val(),
		address:{city:$city.val(),
				 country: $country.val()
				}
	};
	
	console.log(newHotel);

	console.log('calling the ajax post method');

	$.ajax
	({
		type:'POST',
		url:'http://localhost:9000/hotels/newHotel',
		dataType:'json',
		 data: JSON.stringify(newHotel),
		contentType:'application/json',
		success:function(savedHotel){console.log('hotel element saved' + newHotel);},
		/*error:function() {alert('error submitting form!');}*/
	});
}