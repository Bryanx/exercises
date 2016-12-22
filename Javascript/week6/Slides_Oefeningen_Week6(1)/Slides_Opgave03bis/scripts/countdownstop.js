addEventListener('load', init, false);
addEventListener('unload', hold, false);

// Deze opdracht is reeds volledig uitgewerkt, merk het gebruik van het 'unload' event op!

let chrono;         // Globale variabele
let seconden = 10;  // Globale variabele
let tienden = 0;    // Globale variabele

function init() {
    document.getElementById("start").addEventListener('click', start, false);
    document.getElementById("stop").addEventListener('click', hold, false);
    document.getElementById("reset").addEventListener('click', reset, false);
    initDisplay();
}

function initDisplay() {
    document.getElementById("timer").innerHTML = "10.0";
}

function start() {
   chrono = setInterval(display, 100);
}

function hold() {
    clearInterval(chrono);
}

function reset() {
    hold();
    initDisplay();
    seconden = 10;
    tienden = 0;
}

function display() {
    document.getElementById("timer").innerHTML = seconden + "." + tienden;

    if (tienden <= 0) {
        tienden = 9;
        seconden--;
    } else {
        tienden--;
    }
    if (seconden <= -1) {
        hold();
    }
}




