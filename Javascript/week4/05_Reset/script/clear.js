window.addEventListener("load", init, false);

function init() {
   let formulier = document.querySelector("form");
   formulier.addEventListener("reset", formReset, false);
}

function formReset() {
    let feedback = document.querySelector("#feedback");
    feedback.innerHTML = "Nu kan je opnieuw beginnen!";
}