import $ from 'jquery';

export function getCities(){
    fetch("http://localhost:3000/cities")
        .then(response => response.json())
        .then(json => {
            json.forEach(city => {
                $("#cities").append(`<option id='${city.id}'>${city.name}</option>`)
            });
        });
}
