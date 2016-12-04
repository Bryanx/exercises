addEventListener("load", init, false); //wacht tot pagina geladen is

function init() {
    const naam = prompt("Geef je naam:");
    let element = document.getElementById("user");
    element.innerHTML = naam;
}
