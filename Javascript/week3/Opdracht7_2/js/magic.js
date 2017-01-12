addEventListener('load', init, false);

function init() {
    let hier = document.getElementById("hier");
    hier.addEventListener('click', klik, false);
    hier.addEventListener('contextmenu', rechts, false);
}

function klik() {
    let welke = document.getElementById("welke");
    welke.innerHTML = "Left Click!";
}

function rechts(event) {
    event.preventDefault();
    let welke = document.getElementById("welke");
    welke.innerHTML = "Right Click!";
}