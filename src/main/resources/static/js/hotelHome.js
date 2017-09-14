var hotelData =''
	
$(document).ready(function(){
  displayAllHotels();
});


function editHotelInfo()
{
	

}

function displayAllHotels()
{
	$.ajax({
	    type:'GET',
	    url:'http://localhost:9000/hotels/allHotels',
	    success: function(hotels) {
	      
	      $.each(hotels, function (i, hotel) {
	        hotelData += '<tr>';
	        hotelData += '<td>' + hotel.name +'</td>';
	        hotelData += '<td>' + hotel.pricePerNight +'</td>';
	        hotelData += '<td>' + hotel.address.city +'</td>';
	        hotelData += '<td>' + hotel.address.country +'</td>';
	        hotelData += '<td>' + '<button class="btn btn-info" onClick="editHotelInfo()">Edit</button>'+'   '+
								  '<button class="btn btn-danger" onClick="delete()">Delete</button>'+'</td>';
	        hotelData += '</tr>';
	      });

	      $("#hotel_table").append(hotelData);
	    }
	  });
}
