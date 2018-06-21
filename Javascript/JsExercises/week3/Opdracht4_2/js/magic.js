addEventListener('load', init, false);

function init() {
    papa = document.getElementById("groot");
    kind = document.createElement("img");
    papa.appendChild(kind);

    let img = document.getElementsByTagName("img");
    img[0].addEventListener('mouseover', bones, false);
    img[0].addEventListener('mouseout', out, false);
    img[1].addEventListener('mouseover', castle, false);
    img[1].addEventListener('mouseout', out, false);
    img[2].addEventListener('mouseover', mentalist, false);
    img[2].addEventListener('mouseout', out, false);
}

function bones() {
    kind.setAttribute("src", "images/image-bones.jpg");
}

function castle() {
    kind.setAttribute("src", "images/image-castle.jpg");
}

function mentalist() {
    kind.setAttribute("src", "images/image-mentalist.jpg");
}

function out() {
    kind.setAttribute("src", "");
}