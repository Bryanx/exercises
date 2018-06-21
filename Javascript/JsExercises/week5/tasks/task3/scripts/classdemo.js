addEventListener('load', init, false);

function init() {
    let alinea = document.getElementById("alinea");

    alinea.addEventListener('click', gevolg, false);
}

function gevolg() {
    let alinea = document.getElementById("alinea");
    alinea.style.backgroundColor = "maroon";
    alinea.style.color = "#ffe4c4";
}