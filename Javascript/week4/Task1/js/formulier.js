addEventListener('load', init, false);

function init() {
    let val = document.getElementById("valideer");
    val.addEventListener('click', valideerForm, false);
}

function validatieNaam() {
    let naam = document.getElementsByClassName("input")[0];
    let naamFout = document.getElementById("naamFout");

    if (naam.value == "") {
        naamFout.innerHTML = "Vul je naam in!";
    } else if (naam.value.length < 2) {
        naamFout.innerHTML = "Naam moet minimaal 2 tekens lang zijn!";
    }
}

function regTest() {
    let leeftijd = document.getElementsByClassName("input")[1].value;
    const regEx = /^\d+$/;
    return regEx.test(leeftijd);
}

function validatieLeeftijd() {
    let leeftijd = document.getElementsByClassName("input")[1];
    let leeftijdFout = document.getElementById("leeftijdFout");

    if (leeftijd.value == "") {
        leeftijdFout.innerHTML = "Vul je leeftijd in!";
    } else if (leeftijd.value < 0) {
        leeftijdFout.innerHTML = "Leeftijd moet een positief getal zijn!";
    } else if (!regTest()) {
        leeftijdFout.innerHTML = "Leeftijd moet een getal zijn!";
    }
}

function valideerForm(event) {
    let naamGoed = validatieNaam();
    let leeftijdGoed = validatieLeeftijd();

    if (!naamGoed || !leeftijdGoed) {
        event.preventDefault();
    }
}