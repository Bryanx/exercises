window.addEventListener("load", init, false);

function init() {
   let formulier = document.forms["login"];
   formulier.addEventListener("submit", formSubmit, false);
}

function formSubmit(event) {
    //dit gebeurt voordat de submit gebeurt is:
    let feedback = document.querySelector("#feedback");
    feedback.innerHTML = "Je heb geen toegang tot deze website!";
    //submit wordt tegengehouden met preventDefault
    event.preventDefault();
}