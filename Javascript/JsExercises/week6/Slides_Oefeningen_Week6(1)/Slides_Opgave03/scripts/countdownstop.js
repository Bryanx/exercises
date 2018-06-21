window.addEventListener('load', init, false);

// Waar nodig aan te vullen

function init() {
    document.getElementById("start").addEventListener('click', display, false);
    document.getElementById("stop").addEventListener('click', hold, false);
}

let chrono;        // Globale variabele vanaf hier
let seconden = 10; // Globale variabele vanaf hier
let tienden = 0;   // Globale variabele vanaf hier

function display() {


    chrono = setTimeout(display, 100);
}

function hold() {
    clearTimeout(chrono);
}



