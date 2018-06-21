addEventListener("load", verwijderAfmetingen, false);

function verwijderAfmetingen() {
    let image = document.querySelector("img");
    image.removeAttribute("height");
    image.removeAttribute("width");
    let attribuut = document.getElementsByTagName("span")[0];
    attribuut.innerHTML(image.getAttribute("height"));
}






