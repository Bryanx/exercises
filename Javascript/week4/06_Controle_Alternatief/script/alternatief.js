addEventListener("load", init, false);

function init() {
    document.forms[0].addEventListener("submit", valideerFormulier, false);
    // Geen extra eventlisteners!
}

function valideerNaam() {
    let inhoud = document.forms[0]["naam"].value;
    let feedback = document.getElementById("naamfout");
    if (inhoud.length < 2) {
        feedback.innerHTML = "De naam moet minstens 2 tekens lang zijn!";
        return false;
    } else {
        feedback.innerHTML = "";
    }
    return true;
}

function valideerGemeente() {
    let inhoud = document.forms[0]["gemeente"].value;
    let feedback = document.getElementById("gemeentefout");
    if (inhoud.length < 2 || inhoud.length > 26) {
        feedback.innerHTML = " Geen geldige gemeentenaam, foutieve lengte!";
        return false;
    } else {
        feedback.innerHTML = "";
    }
    return true;
}

function valideerFormulier(event) {
     let naamOk = valideerNaam();
     let gemeenteOk = valideerGemeente();

     if (!naamOk || !gemeenteOk)  {
        event.preventDefault();
     }
}