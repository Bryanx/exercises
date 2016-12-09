window.addEventListener('load', init, false);

function init() {
    let gebjaar = document.getElementById("gebjaar");
    gebjaar.addEventListener("blur", valideer, false);
}

function valideerGeboorteJaar(jaar) {
    let huidigJaar = new Date().getFullYear();
    return jaar > 1900 && jaar < huidigJaar;
}

function valideer(event) {
    let resultaat = document.getElementById("resultaat");
    let jaar = event.target.value;
    if (valideerGeboorteJaar(jaar)) {
        resultaat.innerHTML = "Invoer oke";
    } else {
        resultaat.innerHTML = "Invoer fout";
    }

}