addEventListener("load", init, false);

function init() {
    let hier = document.getElementById("hier");
    hier.addEventListener("click", klik, false);
    hier.addEventListener("contextmenu", rechts, false);

    let ul = document.getElementById("bla");
    ul.style.listStyleType = "none";
}

function klik() {
    let hier = document.getElementById("welke");
    hier.innerHTML = "Left clicked!"
}

function rechts() {
    let hier = document.getElementById("welke");
    hier.innerHTML = "Right clicked!"
}