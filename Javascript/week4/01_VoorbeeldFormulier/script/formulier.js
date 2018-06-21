window.addEventListener("load", init, false);

function init() {
    let formulier = document.forms["login"];

    // alternatieven
    let byId = document.getElementById("login");
    let byTagname = document.getElementsByTagName("form")[0];
    let byQuerySelector = document.querySelector("form");

    //verwijzing naar dummy.html:
    alert(formulier.action);
}
