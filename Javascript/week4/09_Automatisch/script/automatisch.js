addEventListener("load", init, false);

function init() {
    let naamVeld = document.querySelector("#naam");
    let form = document.querySelector("form");
//    naamVeld.addEventListener("keyup", validateNaam, false); /* Nu overbodig? */
    form.addEventListener("submit", validateForm, false);
}

function validateNaam() {
    let inhoud = document.getElementById("naam").value;
    let feedback = document.getElementById("error");
    if (inhoud.length < 2) {
        feedback.innerHTML = "De naam moet minstens 2 tekens lang zijn!";
        return false;
    } else {
        feedback.innerHTML = "";
    }
    return true;
}

function validateForm(event) {
    if (!validateNaam()) {
       event.preventDefault();
   }
}