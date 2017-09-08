/**
 * 
 */
function ajaxCall() {

	var jsonResponse = {json:JSON.stingify(contents)};
	$.ajax(
			type:'GET',
			url: "/hotels/allHotels",
			data: jsonfile,
			dataType: "json"
	);
	
}
