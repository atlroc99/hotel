$(document).ready(function(){
  $.ajax({
    type:'GET',
    url:'http://localhost:9000/hotels/allHotels',
    success: function(hotels) {
      var hotelData ='';
      $.each(hotels, function (i, hotel) {
        hotelData += '<tr>';
        hotelData += '<td>' + hotel.name +'</td>';
        hotelData += '<td>' + hotel.pricePerNight +'</td>';
        hotelData += '<td>' + hotel.address.city +'</td>';
        hotelData += '<td>' + hotel.address.country +'</td>';
        hotelData += '</tr>';
      });

      $("#hotel_table").append(hotelData);
    }
  });
});
