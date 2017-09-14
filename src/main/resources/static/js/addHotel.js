$(function() {
	console.log("hello..testing..testing..");
});

/*
 * $("#newHotelForm").submit(function(e){ console.log("hello testing");
 * 
 * var $name = $("#hotelName"); var $pricePerNight = $("#pricePerNight"); var
 * $city = $("#city"); var $country = $("#country");
 * 
 * console.log('Name: ' + $name.val() + ' PricePerNight: ' +
 * $pricePerNight.val() + ' City: ' + $city.val() + ' Country:' +
 * $country.val());
 * 
 * var newHotel = { name : $name.val(), pricePerNight:$pricePerNight.val(),
 * address:{city:$city.val(), country: $country.val() } };
 * 
 * console.log(newHotel);
 * 
 * console.log('calling the ajax post method');
 * 
 * 
 * if($.isEmptyObject(newHotel)) { alert("Error Submitting form"); }
 * 
 * 
 * if($.isEmptyObject(newHotel)) { alert("error submitting the form");
 * window.location="http://localhost:9000/addHotelForm"; } else { $.ajax ({
 * type:'POST', url:'http://localhost:9000/hotels/newHotel', dataType:'json',
 * data: JSON.stringify(newHotel), contentType:'application/json', success:
 * function(){ console.log('inside success block'); }, error: function(){
 * console.log('inside error block'); //
 * window.location="http://localhost:9000/homepage"; } });
 *  } });
 */

function addHotel() {
	console.log("Inside addHotel()");

	var $name = $("#hotelName");
	var $pricePerNight = $("#pricePerNight");
	var $city = $("#city");
	var $country = $("#country");

	console.log('Name: ' + $name.val() + ' PricePerNight: '
			+ $pricePerNight.val() + ' City: ' + $city.val() + ' Country:'
			+ $country.val());

	var newHotel = {
		name : $name.val(),
		pricePerNight : $pricePerNight.val(),
		address : {
			city : $city.val(),
			country : $country.val()
		}
	};

	console.log(newHotel);
	console.log('checking new hotel if condition');
	
	if( (newHotel.name != null && newHotel.name != '') && (newHotel.pricePerNight != 0) 
			&& (newHotel.address.city != null && newHotel.address.city != '' && newHotel.address.city.length > 1)
			&& (newHotel.address.country != null && newHotel.address.country !='' && newHotel.address.country.length > 1))
		{
			console.log('newHotel is not empty :' + newHotel.name);
			$.ajax({
				type : 'POST',
				url : 'http://localhost:9000/hotels/newHotel',
				dataType : 'json',
				data : JSON.stringify(newHotel),
				contentType : 'application/json',
				//this methods does not get called 
				success: function(){
					conosle.log('inside success block function');
					console.log('redirecting');
					window.location= 'http://localhost:9000/homepage'
				},
				//this methods does get called
				//but there is no error
				error : function() {
					console.log('inside success block');
					window.location = "http://localhost:9000/homepage";
				}
			});
		}
	else
		{
			console.log('newHotel is empty');
			alert("Error Submitting form");
		}
	
	
	
	/*if (!$.isEmptyObject(newHotel)) {
		$.ajax({
			type : 'POST',
			url : 'http://localhost:9000/hotels/newHotel',
			dataType : 'json',
			data : JSON.stringify(newHotel),
			contentType : 'application/json',
			error : function() {
				console.log('inside error block')
			},
			success : function() {
				console.log('inside success block');
				window.location = "http://localhost:9000/homepage";
			}
		});
	} else {
		alert("Error Submitting form");
	}*/
}
