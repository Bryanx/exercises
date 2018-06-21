window.addEventListener('load', init, false);

function init() {
    document.querySelector("#naamId").innerHTML = getParam("naam");
    document.querySelector("#leeftijdId").innerHTML = getParam("leeftijd");
}

// Oplossing uit het cursusboek
function getParam(name) {
    let queryString = decodeURIComponent(location.search.replace(/\+/g, " "));
    let regex =  new RegExp(name + "=([^&*]+)");
    let result = regex.exec(queryString);
    if (result) {
        return result[1];
    }
    return null;
}

