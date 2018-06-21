window.addEventListener("load", init, false);

function init() {
    let formulier = document.forms["login"];   // voeg "submit" listener toe


    // Alternatieven
    // let byId = document.getElementById("login");
    // let byTagname = document.getElementsByTagName("form")[0];
    // let byQuerySelector = document.querySelector("form");

    formulier.addEventListener("submit", loginSubmit, false);
}

function loginSubmit(event) {
    let ok = true;
    let naam = document.getElementById("naam");
    let password = document.getElementById("password");
    let naamfout = document.getElementById("naamfout");
    let passwordfout = document.getElementById("passwordfout");

    naamfout.innerHTML = "";
    passwordfout.innerHTML = "";

    // Vul hier aan!
    if (!naam.value){
        naamfout.innerHTML = "Naam niet ingevuld.";
        ok = false;
    }
    if (!password.value){
        passwordfout.innerHTML = "Password niet ingevuld.";
        ok = false;
    }
    if (!ok) {
        event.preventDefault();
    }
    // Controleer of beide velden ingevuld zijn, geef eventueel een foutmelding
    // Zorg er voor dat je alleen naar de pagina dummy.html kunt gaan als beide velden ingevuld zijn.

}
