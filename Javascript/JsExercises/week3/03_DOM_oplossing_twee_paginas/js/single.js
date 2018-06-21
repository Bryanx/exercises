// Theoretisch voorbeeld, uitleg over de code volgt later!

function initEen() {
    "use strict";
    let head = document.querySelector("h1");
    head.innerHTML = "Dit is de EERSTE functie!";
    let span = document.getElementsByTagName("span")[0];
    span.innerHTML = kwadraat(4);
}

function initTwee() {
    "use strict";
    let head = document.querySelector("h1");
    head.innerHTML = "Dit is de TWEEDE functie!";
    let span = document.getElementsByTagName("span")[0];
    span.innerHTML = kwadraat(8);
}

function kwadraat(x) {
    "use strict";
    return x * x;
}