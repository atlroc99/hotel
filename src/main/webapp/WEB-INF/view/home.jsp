<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
/* var jsonResponse = {json:JSON.stingify(contents)}; */
$.ajax({
		type:'GET',
		url: "/hotels/allHotels",
		data: jsonfile,
		dataType: "json"
});

</script>
</head>
<body>

<h2>Hotels com -> landing page for the hotels</h2>
<div id="div1"></div>

<button>Click to get Data</button>
</body>
</html>