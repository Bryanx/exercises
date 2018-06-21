addEventListener('load', init, false);

// Waar nodig aan te vullen

function init() {
    document.getElementById("start").addEventListener('click', display, false);
}

let seconden = 10;
let tienden = 0;

function display() {
    let span = document.getElementById("timer");
    span.innerHTML = seconden;
    span.innerHTML += tienden;

    if (seconden <= 0) {
        clearTimeout(display);
        for (let i = 0;i<10;i++) {
            if (seconden == i) {
                tienden = tienden - 10;
                tienden = tienden - 1;
                clearTimeout(display);
            }
        }
    } else {
        seconden--;

    }

    setTimeout(display, 500); // functie roept zichzelf aan
}



