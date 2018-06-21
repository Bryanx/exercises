addEventListener('load', init, false);

function init() {
    let p = document.getElementById("p");
    p.addEventListener('click', klik, false);
    p.addEventListener('mouseover', hover, false);
    p.addEventListener('mouseout', out, false);
}

function klik() {
    f = document.getElementById("f");
    f.setAttribute("src", "images/button_down.gif");
}

function hover() {
    f.setAttribute("src", "images/button_over.gif");
}

function out() {
    f.setAttribute("src", "images/button_off.gif");
}