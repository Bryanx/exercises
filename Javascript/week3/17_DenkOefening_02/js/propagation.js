addEventListener("load", windowLoaded, false);

function windowLoaded() {
    let theLink = document.querySelector("a");
    let theParagraph = document.querySelector("p");
    theLink.addEventListener("click", linkClicked, false);
    theParagraph.addEventListener("click", pClicked, true);
}

function linkClicked(event) {
    alert("Link " + event.target + " clicked!");
}

function pClicked(event) {
    alert("Paragraph  " + event.target + " clicked!");
}
