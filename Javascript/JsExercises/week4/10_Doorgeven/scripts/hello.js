window.addEventListener('load', init, false);

function init() {
    let naamId = document.getElementById("naamId");
    let leeftijdId = document.getElementById("leeftijdId");

    naamId.innerHTML = getParam("naam");
    leeftijdId.innerHTML = parseInt(getParam("leeftijd"), 10);
}

//
// Oplossing zoals beschreven in de slides
//
function getParam(name) {
    let query = decodeURIComponent(window.location.search.substring(1));
    let lets = query.split("&");
    let value = "";
    for (let i = 0; i < lets.length; i++) {
        let parts = lets[i].split("=");
        if (parts[0] == name) {
            value = parts[1];
            break;
        }
    }
    return value.replace(/\+/g, " ");
}
