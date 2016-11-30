/**
 * Created by Kristiaan on 26/11/2016.
 */

addEventListener("load", init, false);

function mijnEventHandler(event) {
    alert("Het event " + event + " is net gebeurd!");
    event.preventDefault();
}

function init(event) {
    let knop = document.getElementById("knop");
    knop.addEventListener("click", mijnEventHandler, false);
}

