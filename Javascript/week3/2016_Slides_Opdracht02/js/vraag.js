addEventListener("load", init, false);

function init() {
    const name = prompt("Geef je naam:");
    let element = document.getElementById("user");
    element.innerHTML = name;
}
