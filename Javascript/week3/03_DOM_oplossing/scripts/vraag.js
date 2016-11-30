addEventListener("load", init, false);

function init() {
    const naam = prompt("Geef je naam:");
    let element = document.getElementById("user");
    element.innerHTML = naam;
}
