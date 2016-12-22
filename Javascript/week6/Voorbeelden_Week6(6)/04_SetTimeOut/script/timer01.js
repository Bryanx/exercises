window.addEventListener('load', init, false);

function init() {
    setTimeout(vertraagd, 3000);
}

function vertraagd() {
    document.querySelector("#later").innerHTML = "W817";
}
