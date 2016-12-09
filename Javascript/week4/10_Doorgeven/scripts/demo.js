window.addEventListener('load', init, false);

function init() {
    let submit = document.getElementById("myform");
    let naamField = document.getElementById("naam");
    let leeftijdField = document.getElementById("leeftijd");

    submit.addEventListener('submit', valideer, false); // listener op form!
    naamField.addEventListener('blur', valideerNaam, false);
    leeftijdField.addEventListener('blur', valideerLeeftijd, false);
}

function valideerNaam() {
    let naam = document.getElementById("naam").value.trim();
    let naamFout = document.getElementById("naamfout");
    if (naam.length < 2) {
        naamFout.innerHTML = "De naam moet minimaal 2 tekens lang zijn";
        return false;
    } else {
        naamFout.innerHTML = "";
    }
    return true;
}

function valideerLeeftijd() {
    let leeftijd = parseInt(document.getElementById("leeftijd").value, 10);
    let leeftijdFout = document.getElementById("leeftijdfout");
    if (isNaN(leeftijd) || leeftijd < 0 || leeftijd > 130) {
        leeftijdFout.innerHTML = "Onmogelijke leeftijd";
        return false;
    } else {
        leeftijdFout.innerHTML = "";
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
