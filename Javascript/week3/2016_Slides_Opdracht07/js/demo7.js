addEventListener("load", init, false);

function init(){
    let kleur = document.querySelector("#kleur");
    kleur.addEventListener("click", realColors, false);
}

function realColors(){
    const images = ["red.jpg", "blue.jpg", "green.jpg", "black.jpg"];
    const kleuren = ["black", "blue", "green", "red"];

    let elementen = document.querySelectorAll("img");

    for (let i = 0; i<elementen.length; i++) {
        elementen[i].src = "images/" + images[i];
        elementen[i].alt = kleuren[i];
    }
}