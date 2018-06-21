import $ from 'jquery';

export function doOldAjaxCall() {
    const xhr = new XMLHttpRequest();
    xhr.open('GET', 'http://jsonplaceholder.typicode.com/users/1');
    xhr.responseType = 'json';
    xhr.onload = function () {
        if (this.status >= 200 && this.status < 400) {
            // Success!
            const resp = this.response;
            console.log(resp);
            document.getElementById("user").innerHTML = resp.name;
        } else {
            // reached server, but it returned an error
        }
    };
    xhr.onerror = function () {
        /* connection error */
    };
    xhr.send();
}

export function doModernAjaxCall() {
    $.ajax({
        method: "GET",
        url: "http://jsonplaceholder.typicode.com/users/1",
        success: data => $("#user").html(data.name),
        error: error => {
            if (error.status === 404) console.log("Not found.");
            else console.log("Unknown error");
        }
    });
}

export function doFutureAjaxCall() {
    $.getJSON(
        "http://jsonplaceholder.typicode.com/users/1",
        data => $("#user").html(data.name)
    );
}

export function doFetchApiCall() {
    fetch("http://jsonplaceholder.typicode.com/users/1")
        .then((response) => response.ok ? data.json() : "") //json wordt gereturned uit de promise
        .then((json) => $("#user").html(json.name)) //uit de json wordt de naam gehaald
        .catch((error) => console.log(error))
        .finally(() => console.log(done));
}