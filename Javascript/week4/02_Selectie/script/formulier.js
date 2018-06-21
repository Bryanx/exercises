window.addEventListener("load", init, false);

function init() {
    let formulier = document.forms["login"];
    let veld = formulier.naam;
    alert(veld);
    //inhoud van het invoerveld:
    alert(veld.value);

    // alternatieven
    let byId = document.getElementById("naam");
    alert("id " +  byId.value);

    let byTagname = document.getElementsByTagName("input")[0];
    alert("tag " + byTagname.value);

    let byQuerySelector = document.querySelector("#naam");
    alert("query" + byQuerySelector.value);
}
