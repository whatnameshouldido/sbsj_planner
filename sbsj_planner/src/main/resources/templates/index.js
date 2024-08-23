function initMap() {
    const map = new google.maps.Map(document.getElementById("map"), {
        center: { lat: 37.5400456, lng: 126.9921017 },
        zoom: 10
    });

    const malls = [
        { label: "A", name: "대우능력개발원", lat: 37.5963, lng: 127.0842 },
    ];

    const bounds = new google.maps.LatLngBounds();
    const infoWindow = new google.maps.InfoWindow();

    const input = document.getElementById("search-box");
    const searchBox = new google.maps.places.SearchBox(input);

    const marker = new google.maps.Marker({
        map,
        anchorPoint: new google.maps.Point(0, -29),
    });

    searchBox.addListener("places_changed", () => {
        const places = searchBox.getPlaces();
        if (places.length == 0) return;

        const place = places[0];
        input.value = place.name;
        if (!place.geometry || !place.geometry.location) {
            console.log("Returned place contains no geometry");
            return;
        }

        marker.setPosition(place.geometry.location);
        marker.setVisible(true);
        map.setZoom(15);
        map.setCenter(place.geometry.location);

        const infowindowContent = `
            <div>
                <strong>${place.name}</strong><br>
                <span>${place.formatted_address}</span>
            </div>
        `;
        infoWindow.setContent(infowindowContent);
        infoWindow.open(map, marker);
    });

    malls.forEach(({ label, name, lat, lng }) => {
        const mallMarker = new google.maps.Marker({
            position: { lat, lng },
            label,
            map
        });
        bounds.extend(mallMarker.position);

        mallMarker.addListener("click", () => {
            map.panTo(mallMarker.position);
            infoWindow.setContent(name);
            infoWindow.open(map, mallMarker);
        });
    });

    map.fitBounds(bounds);
}
