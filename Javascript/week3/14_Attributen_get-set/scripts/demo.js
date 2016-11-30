addEventListener("load", vervangAutoDoorFiets, false);

function vervangAutoDoorFiets() {
    let image = document.getElementsByTagName("img")[0];
    image.setAttribute("src", "images/fiets.jpg");
    image.setAttribute("alt", "fiets");
    let space = document.querySelector("span");
    space.innerHTML = image.getAttribute("src");
}






