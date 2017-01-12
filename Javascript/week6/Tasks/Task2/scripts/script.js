/**
 * Created by Bryan on 11-01-17.
 */

addEventListener('load', init, false);

function init() {
    let string = "Toegepaste Informatica".split("").reverse().join("");
    let span = document.getElementById("omgekeerd");
    span.innerHTML = string;
}