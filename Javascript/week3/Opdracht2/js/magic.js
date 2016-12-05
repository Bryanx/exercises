addEventListener("load", image, false);

function image() {
    let afb = document.getElementById("f");
    afb.addEventListener("click", klik, false);
    afb.addEventListener("mouseover", hover, false);
    afb.addEventListener("mouseout", out, false);
}

function klik() {
    document.getElementById("f").src = "images/button_down.gif";
}

function hover() {
    document.getElementById("f").src = "images/button_over.gif";
}

function out() {
    document.getElementById("f").src = "images/button_off.gif";
}