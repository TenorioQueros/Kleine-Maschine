function initialize() {
	var myOptions = {
		zoom: 15,
		center: new google.maps.LatLng(-23.5581416, -46.6615821), //cordenadas do local
		mapTypeId: google.maps.MapTypeId.ROADMAP,
		scrollwheel: false,
		mapTypeControl: false,
		zoomControl: false,
		streetViewControl: false
	}
	var img_icon = 'img/map-marker.png';
	var map = new google.maps.Map(document.getElementById("map-canvas"), myOptions);
	var marker = new google.maps.Marker({
		map: map,
		icon: img_icon,
		position: new google.maps.LatLng(-23.5581416, -46.6615821) //cordenadas do local
	});
	google.maps.event.addListener(marker, "click", function() {
		infowindow.open(map, marker);
	});
}
google.maps.event.addDomListener(window, 'load', initialize);
