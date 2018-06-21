// Alles in 1 JavaScript document!

// --------------------------------------------------------------------------
// Script 1 (demo.js)
//---------------------------------------------------------------------------
function initDemo() {
    let submit = document.querySelector("form");  // tag
    let naamField = document.querySelector("#naam");  // id
    let leeftijdField = document.querySelector("#leeftijd"); //id

    submit.addEventListener('submit', valideer, false); // listener op form!
    naamField.addEventListener('blur', valideerNaam, false);
    leeftijdField.addEventListener('blur', valideerLeeftijd, false);
}

function valideerNaam() {
    let naam = document.querySelector("#naam").value.trim();
    let naamFout = document.querySelector("#naamfout");
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

// --------------------------------------------------------------------------
// Script 2 (was hello.js)
//---------------------------------------------------------------------------
function initHello() {
    let naamId = document.getElementById("naamId");
    let leeftijdId = document.getElementById("leeftijdId");

    naamId.innerHTML = getParam("naam");
    leeftijdId.innerHTML = getParam("leeftijd");
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