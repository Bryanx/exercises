addEventListener('load', init, false);

function init() {
    let submitButton = document.getElementById("verzend");
    let naamField = document.getElementById("naam");
    let leeftijdField = document.getElementById("leeftijd");

    submitButton.addEventListener('click', valideer, false);
    naamField.addEventListener('blur', valideerNaam, false);
    leeftijdField.addEventListener('blur', valideerLeeftijd, false);
}

function valideerNaam() {
    let naam = document.getElementById("naam").value.trim();
    let naamFout = document.getElementById("naamFout");
    if (naam.length < 2) {
        naamFout.innerHTML = "De naam moet minimaal 2 tekens lang zijn";
        return false;
    }
    return true;
}

function valideerLeeftijd() {
    let leeftijd = parseInt(document.getElementById("leeftijd").value, 10);
    let leeftijdFout = document.getElementById("leeftijdFout");
    if (isNaN(leeftijd) || leeftijd < 0 || leeftijd > 130) {
        leeftijdFout.innerHTML = "Onmogelijke leeftijd";
        return false;
    }
    return true;
}

function valideer(event) {
    let naamOk  = valideerNaam();
    let leeftijdOk = valideerLeeftijd();

    if (!naamOk || !leeftijdOk) {
        event.preventDefault();
    }
}